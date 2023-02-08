package ru.konovalov.kotlinTest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var helloTextView: TextView
    private lateinit var helloButton: ImageButton
    private lateinit var nameField: EditText
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        helloTextView = findViewById(R.id.textView)
        helloButton = findViewById(R.id.imageButton)
        nameField = findViewById(R.id.editTextTextPersonName)


        helloButton.setOnClickListener{

        if(nameField.text.isEmpty()){
         helloTextView.text = "Hello Kitty"
        }
        else{
                helloTextView.text = "Hello" + nameField.text
        }
        }
    }
}