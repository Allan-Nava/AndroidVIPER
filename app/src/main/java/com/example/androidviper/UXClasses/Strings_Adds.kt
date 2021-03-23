package com.example.androidviper.UXClasses

/**
 * Created by Allan Nava on 23/03/2021.
 * Updated by Allan Nava on 23/03/2021.
 */
fun String.capitalizeFirstLetter(): String{
    val words = this.split(" ")
    val sb = StringBuilder()
    try {
        if (words[0].length > 0) {
            sb.append(
                Character.toUpperCase(words[0].get(0)) + words[0].subSequence(
                    1,
                    words[0].length
                ).toString().toLowerCase()
            )
            for (i in 1 until words.size) {
                sb.append(" ")
                sb.append(
                    Character.toUpperCase(words[i].get(0)) + words[i].subSequence(
                        1,
                        words[i].length
                    ).toString().toLowerCase()
                )
            }
        }
    }catch (e: Exception) {
        e.printStackTrace()
    }
    return sb.toString()
}

val String.trimWhitespacesAndNewlines: String
    get() = this.replace("^ | $|\\n ", "")
