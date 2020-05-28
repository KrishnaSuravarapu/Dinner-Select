package com.example.dinnerselect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val dishList= arrayListOf("Chinese","Italian","Indian","French","Pizza","Burritos")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random= Random()
            val foodSelect=random.nextInt(dishList.count())
            Fooddisplayer.text=dishList[foodSelect]
        }
        adddishbtn.setOnClickListener {
            val newfood=newdish.text.toString()
            if(!(newfood.isEmpty())){
            dishList.add(newfood)
            newdish.text.clear()
            }
        }
    }
}
