package com.padcx.customcomponentproj.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padcx.customcomponentproj.R

class CreateTaskActivity : AppCompatActivity() {

    companion object{
        fun newIntent(context: Context): Intent {

            val intent = Intent(context,CreateTaskActivity::class.java)
            return intent
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_task)
    }
}
