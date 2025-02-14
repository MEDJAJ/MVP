package com.example.mvp.View

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.mvp.Model.Person
import com.example.mvp.Presenter.PrenterPerson
import com.example.mvp.Presenter.Presenter
import com.example.mvp.R

class MainActivity2 : AppCompatActivity(),main2View{
    lateinit var namem:TextView
    lateinit var age:TextView
    lateinit var btn:Button
    lateinit var afficher:TextView
    lateinit var presenter: PrenterPerson
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        namem=findViewById(R.id.name)
        age=findViewById(R.id.age)
        btn=findViewById(R.id.btnAge)
        afficher=findViewById(R.id.afficher)
        presenter=PrenterPerson(this)
btn.setOnClickListener {
    val nam=namem.text.toString()
    val ag=age.text.toString()
    presenter.afficherAge(nam,ag)
}

    }

    override fun afficherAge(person: Person) {
        afficher.text="Bonjor ${person.name} your age ${person.age}"

    }

    override fun afficherError(error: String) {
        afficher.text=error
    }
}