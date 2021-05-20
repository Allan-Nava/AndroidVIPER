# Android VIPER
![Android Pull Request & Master CI](https://github.com/Allan-Nava/AndroidVIPER/workflows/Android%20Pull%20Request%20&%20Master%20CI/badge.svg) ![Android Feature Branch CI](https://github.com/Allan-Nava/AndroidVIPER/workflows/Android%20Feature%20Branch%20CI/badge.svg)

<img src="https://koenig-media.raywenderlich.com/uploads/2020/02/viper.png">

<img src="https://miro.medium.com/max/1354/1*HZIOzvXyvkpW4ytr2g0NvQ.png">

VIPER is an architectural approach for iOS mobile app development based on the paradigm of Uncle Bob's clean architecture, which gradually began to penetrate with Android. The word VIPER is an abbreviation for View, Interactor, Presenter, Entity, and Router.

## Defintions

In Viper architecture, each block corresponds to an object with specific tasks, inputs and outputs. It is very similar to workers in an assembly line: once the worker completes its job on an object, the object is passed along to the next worker, until the product is finished.

V (View): View is responsible for the UI updates and show whatever the presenter tells it.

I (Interactor) : The Interactor is responsible for fetching data from the model layer, and its implementation is totally independent of the user interface.All the business logic written inside the Interactor. E.g. Get User Data API call written in the Interactor.

P (Presenter): Presenter performing role as intermediator it gets data from interaction and passes to View. (It may be data or any user action)

E (Entity): Basically it is contains the Object Model which is used by Interactor. E.g. Student,Friend,College etc.

R (Router): It contains navigation logic for the application. E.g. Next button action shows second screen.

Morever, I’ve use the PROTOCOL, which contains all the rules and work-flow for the particular module of the application. In iOS all the protocols written in the separate protocol swift file for each module.

## Benefits:

-All the modules are independent so VIPER is really good for large teams.

-It makes the source code cleaner, more compact and reusable

-It easier to adopt TDD (Test Driven Development)

-You can add easily new features to the existing application without changing other modules possibly.

-It can be applies SOLID principles.

-Reduced number of merge conflicts.

-It Makes it easy to write automated tests since your UI logic is separated from the business logic

## Documentations :
- https://cheesecakelabs.com/blog/using-viper-architecture-android/
- https://medium.com/omisoft/https-medium-com-omisoft-viper-in-android-the-practical-guide-or-how-to-catch-a-snake-78cc17e96d63
- https://www.raywenderlich.com/5192-android-viper-tutorial#toc-anchor-001
