package com.proactive.junglejack.app.Model


class Onion {

    var isCooked = false

    val taste: String
        get() {
            return if (isCooked) "sweet"
            else "bitter"
        }

    val structure: String
        get() {
            return if (isCooked) "crunchy"
            else "sweet"
        }

}