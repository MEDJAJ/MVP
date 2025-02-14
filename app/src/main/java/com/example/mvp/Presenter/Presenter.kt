package com.example.mvp.Presenter

import com.example.mvp.Model.User
import com.example.mvp.View.mainView

class Presenter(val main:mainView){
    fun afficher(name:String){
        var user=User(name)
        if (user.name.isNotEmpty()){
            main.afficherMessage(user.name)
        }else{
            main.afficherError("Please entrer une nom")
        }

    }

}
