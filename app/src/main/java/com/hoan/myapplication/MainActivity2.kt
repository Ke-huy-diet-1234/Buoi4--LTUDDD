package com.hoan.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.hoan.myapplication.VolleyFn1
import com.hoan.myapplication.R
import android.content.Context
import android.annotation.SuppressLint




class MainActivity2 : AppCompatActivity() {
    var context: Context = this
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btnGet=findViewById<Button>(R.id.btnGetData)
        var tvKQ=findViewById<TextView>(R.id.tvKQ)
        val fn1 = VolleyFn1()
        btnGet!!.setOnClickListener {
            fn1.getAllData(context, tvKQ!!)
        }
    }
}














