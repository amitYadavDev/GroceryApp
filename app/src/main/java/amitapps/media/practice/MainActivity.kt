package amitapps.media.practice

import amitapps.media.practice.databinding.ActivityMainBinding
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil


class MainActivity : ComponentActivity() {
    var _binding: ActivityMainBinding? = null
    val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main)



    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity__1", "onStart")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity__1", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity__1", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity__1", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity__1", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity__1", "onDestroy")
    }
}