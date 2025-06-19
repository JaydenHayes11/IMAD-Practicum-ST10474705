package za.co.varsitycollege.imad_practicum_st10474705

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val addButton = findViewById<Button>(R.id.addButton)
        val exitAppButton = findViewById<Button>(R.id.exitAppButton)
        val songDetailsButton = findViewById<Button>(R.id.songDetailsButton)
        val songTitleText = findViewById<EditText>(R.id.songTitleTextText)
        val artistNameText = findViewById<EditText>(R.id.artistNameTextText)
        val commentsText = findViewById<EditText>(R.id.commentsTextText)
        val ratingTextNumber = findViewById<EditText>(R.id.ratingTextNumber)

        addButton.setOnClickListener {
            Toast.makeText(this@MainActivity,
                "Please Enter Details for song!", Toast.LENGTH_LONG).show()

        }

        songDetailsButton.setOnClickListener {
            Toast.makeText(this@MainActivity,
                "Button Clicked", Toast.LENGTH_LONG).show()

            val intent = Intent(this, DetailedViewScreen::class.java)
            startActivity(intent)

            intent.putExtra("SongTitle",songTitleText.text.toString())
            intent.putExtra("ArtistName",artistNameText.text.toString())
            intent.putExtra("Comments",commentsText.text.toString())
            intent.putExtra("Rating",ratingTextNumber.text.toString())
        }

        exitAppButton.setOnClickListener {
            finishAffinity()
        }
    }

}