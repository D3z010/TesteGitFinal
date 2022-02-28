package ipvc.estg.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onPause() {
        super.onPause()
        Log.d("tag","metodo onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("tag","metodo onStop")
    }

    override fun onResume() {
        super.onResume()
        Log.d("tag","metodo onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("tag","metodo onDestroy")
    }

// teste no1

    // Teste no3 - Commit e push alteração


}