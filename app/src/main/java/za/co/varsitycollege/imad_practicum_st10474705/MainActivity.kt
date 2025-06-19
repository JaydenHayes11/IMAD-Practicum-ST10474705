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
        var ratingTextNumber = findViewById<EditText>(R.id.ratingTextNumber)

        addButton.setOnClickListener {
            Toast.makeText(this@MainActivity,
                "Please Enter Details for song!", Toast.LENGTH_LONG).show()

        }

        songDetailsButton.setOnClickListener {

            val intent=Intent(this, DetailedViewScreen::class.java)

            intent.putExtra("Rating",
                            ratingTextNumber.text.toString())

            startActivity(intent)

        }

        exitAppButton.setOnClickListener {
            finishAffinity()
        }
    }

}