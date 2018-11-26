package edu.fullerton.cpsc411.mini_app03

//import android.support.v7.app.AppCompatActivity
import android.os.Bundle
//import android.support.v4.app.FragmentManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import androidx.fragment.app.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpleFragment = SimpleFragment()
        if (supportFragmentManager.findFragmentById(R.id.fragment_container) == null) {
//            supportFragmentManager.beginTransaction()
//                    .add(R.id.fragment_container, simpleFragment)
//                    .addToBackStack(null)
//                    .commit()
            supportFragmentManager.transaction(allowStateLoss = true) {
                add(R.id.fragment_container, SimpleFragment())
            }

        }
    }
}
