package com.example.maxcalculatorapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var display_result:TextView
    lateinit var first_edt:EditText
    lateinit var second_edt:EditText

    lateinit var btn_add:Button
    lateinit var btn_multiply:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        first_edt = findViewById(R.id.edtnumx)
        second_edt = findViewById(R.id.edtnumy)
        btn_add = findViewById(R.id.addxy)


        btn_add.setOnClickListener {

            var num1 = first_edt.text.toString().trim()
            var num2 = second_edt.text.toString().trim()


            //convert to double

            var first_num = num1.toDouble()
            var second_num = num2.toDouble()

            //Result is in double
            var result = first_num + second_num


            //Convert back to string

            var finalresult = result.toString()

            Toast.makeText(this, "finalresult", Toast.LENGTH_SHORT).show()



        }





    }

}