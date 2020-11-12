interface LoginContracts {
  interface View {
    fun showError(message: String)
  }
  
  interface Presenter {
    fun onDestroy()
    fun onLoginButtonPressed(username: String, password: String)
  }
  
  interface Interactor {
    fun unregister()
    fun login(username: String, password: String)
  }
  
  interface InteractorOutput {
    fun onLoginSuccess(user: User)
    fun onLoginError(message: String)
  }

  interface Router {
    fun unregister()
    fun presentHomeScreen(user: User)
  }
}

class LoginActivity: BaseActivity, LoginContracts.View {
  
  var presenter: LoginContracts.Presenter? = null
  
  //other fields

  override fun onCreate() {
    //...
    presenter = LoginPresenter(this)
    loginButton.setOnClickListener { onLoginButtonClicked() }
    //...
  }
  
  override fun onDestroy() {
    presenter?.onDestroy()
    presenter = null
    super.onDestroy()
  }

  private fun onLoginButtonClicked() {
    presenter?.onLoginButtonClicked(usernameEditText.text, passwordEditText.text)
  }
  
  fun showError(message: String) {
    //shows the error on a dialog
  }
}

class LoginPresenter(var view: LoginContracts.View?): LoginContracts.Presenter, LoginContracts.InteractorOutput {
    var interactor: LoginContracts.Interactor? = LoginInteractor(this)
    var router: LoginContracts.Router? = LoginRouter(view as? Activity)

    fun onDestroy() {
      view = null
      interactor?.unregister()
      interactor = null
      router?.unregister()
      router = null
    }

    fun onLoginButtonPressed(username: String, password: String) {
      interactor?.login(username, password)
    }

    fun onLoginSuccess(user: User) {
      router?.goToNextScreen(user)
    }
    
    fun onLoginError(message: String) {
      view?.showError(message)
    }
}

class LoginInteractor(var output: LoginContracts.InteractorOutput?): LoginContracts.Interactor {
  
  fun unregister() {
    output = null
  }
  
  fun login(username: String, password: String) {
    LoginApiManager.login(username, password)
                ?.subscribeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe({ 
                          //does something with the user, like saving it or the token
                          output?.onLoginSuccess(it)
                          },
                        { output?.onLoginError(it.message ?: "Error!") })
  }
}

class LoginRouter(var activity: Activity?): LoginContracts.Router {
  
  fun unregister() {
    activity = null
  }
  
  fun presentHomeScreen(user: User) {
    val intent = Intent(view, HomeActivity::class.java)
    intent.putExtra(Constants.IntentExtras.USER, user)
    activity?.startActivity(intent)
  }
}
