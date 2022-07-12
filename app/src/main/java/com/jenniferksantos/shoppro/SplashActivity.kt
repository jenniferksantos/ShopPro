package com.jenniferksantos.shoppro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Handler().postDelayed(
            {
                //Launch the Login Activity
                startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
                finish() // Call this when ur activity is done n' should be closed.
            },
            1500
        )

       // val typeface:Typeface = Typeface.createFromAsset(assets, "Montserrat-Bold.ttf")
        // tv_app_name.typeface = typeface
    }
}