package example.irina.irinaapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

const val TAG = "MainActivity"
var poem = listOf(
    "Тихо-тихо, сказку напевая,",
    "Проплывает в сумерках зима,",
    "Теплым одеялом укрывая",
    "Землю и деревья и дома.",
    "Над полями легкий снег кружится,",
    "Словно звезды падают с небес",
    "Опустив мохнатые ресницы,",
    "Дремлет в тишине дремучий лес.",
    "Спят на елках золотые совы",
    "В сказочном сиянии луны.",
    "На опушке леса спят сугробы",
    "Как большие белые слоны."
)
var i = 0


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, poem.get(i))
        i++
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, poem.get(i))
        i++
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, poem.get(i))
        i++
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, poem.get(i))
        i++

    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, poem.get(i))
        i++
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, poem.get(i))
        i++
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, poem.get(i))
        i++

    }
}