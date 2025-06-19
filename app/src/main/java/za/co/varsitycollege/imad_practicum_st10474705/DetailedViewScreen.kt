package za.co.varsitycollege.imad_practicum_st10474705

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity




class DetailedViewScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view_screen)




//declaring components used in UI to be used in code
        val songsButton = findViewById<Button>(R.id.songsDisplayButton)
        val returnButton = findViewById<Button>(R.id.returnButton)
        val averageButton = findViewById<Button>(R.id.averageButton)

//Opening the add button to have code inserted to perform actions when clicked
        averageButton.setOnClickListener {
            Toast.makeText(this@DetailedViewScreen,
                "Button clicked", Toast.LENGTH_LONG).show()

        }

//Opening the add button to have code inserted to perform actions when clicked
        songsButton?.setOnClickListener {
            val bundle: Bundle? = intent.extras

            val songString: String? = bundle?.getString("songTitle")
            val songTitle = songString.toString()
            val artistString: String? = bundle?.getString("artistName")
            val artistName = artistString.toString()
            val ratingString: String? = bundle?.getString("rating")
            val rating = ratingString?.toInt()
            val commentString: String? = bundle?.getString("comments")
            val comments = commentString.toString()

            val displayTextView = findViewById<TextView>(R.id.displayTextView)
            displayTextView.text = "$songTitle,\n$artistName,\n$rating,\n$comments"


        }


//Opening the add button to have code inserted to perform actions when clicked
        returnButton?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}