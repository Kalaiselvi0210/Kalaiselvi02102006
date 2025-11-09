// place in src/main/java/com/yourpackage/MainActivity.kt
package com.yourpackage.dashboard
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sabari.dashoard.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}