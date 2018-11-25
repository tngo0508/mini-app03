package edu.fullerton.cpsc411.mini_app03

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            // During initial setup, plug in the details fragment.
            val details = SimpleFragment().apply {
                arguments = intent.extras
            }
            supportFragmentManager.beginTransaction()
                    .add(android.R.id.content, details)
                    .commit()
        }
    }
}