package za.co.varsitycollege.imad_practicum_st10474705

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedViewScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view_screen)

        val bundle: Bundle? = intent.extras
        val tableString: String? = bundle?.getString("songTitle"+"artistName"+"comments"+"rating")

        val rating = tableString!!.toInt()

        val displayTextView = findViewById<TextView>(R.id.displaytextView)

        displayTextView.text = "$rating"
    }
}