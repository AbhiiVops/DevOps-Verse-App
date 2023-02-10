package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var titleName: String? = "Unknown"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scrollview)

        if(intent != null) {
            titleName = intent.getStringExtra("Name")

        }




      //  title = "DevOps Verse"  //--> Title of the app on the toolbar rea can be changed from here
        title = titleName
    }


}