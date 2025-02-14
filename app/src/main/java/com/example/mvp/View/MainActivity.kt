package com.example.mvp.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.mvp.Presenter.Presenter
import com.example.mvp.R

class MainActivity : AppCompatActivity(),mainView{
    lateinit var presenter:Presenter
   lateinit var result:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       val edit=findViewById<EditText>(R.id.edittext)
        val btn=findViewById<Button>(R.id.btn)
         result=findViewById(R.id.result)
        presenter=Presenter(this)

btn.setOnClickListener{
    val name=edit.text.toString()
    presenter.afficher(name)
    val i=Intent(this,MainActivity2::class.java)
    startActivity(i)

}
    }

    override fun afficherMessage(name: String){
result.text="hellow $name"
    }

    override fun afficherError(error: String) {
        result.text=error
    }
}