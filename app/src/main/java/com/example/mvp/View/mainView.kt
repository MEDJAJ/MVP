package com.example.mvp.View

import com.example.mvp.Model.Person

interface mainView {
    fun afficherMessage(name:String)
    fun afficherError(name:String)
}

interface main2View {
    fun afficherAge(person: Person)
    fun afficherError(error: String)
}