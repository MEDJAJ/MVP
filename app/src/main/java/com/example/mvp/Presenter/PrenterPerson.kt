package com.example.mvp.Presenter

import com.example.mvp.Model.Person
import com.example.mvp.View.main2View
import java.util.Calendar

class PrenterPerson(val main: main2View) {
    fun afficherAge(name:String,date:String){
        if (name.isNotEmpty() && date.isNotEmpty()){
            val age=Calendar.getInstance().get(Calendar.YEAR)
            var year=age-date.toInt()
            var person=Person(name,year)
            main.afficherAge(person)
        }else{
            main.afficherError("please entrer your date and name")
        }
    }
}