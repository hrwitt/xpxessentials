package com.example.xpxessentials

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class ExploreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

    }

    companion object {

        fun newExploreIntent(context: Context): Intent {
            val intent = Intent(context, ExploreActivity::class.java)
            return intent
        }

    }
}
