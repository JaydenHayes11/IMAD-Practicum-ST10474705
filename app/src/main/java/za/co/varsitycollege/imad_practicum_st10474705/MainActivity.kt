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
    @SuppressLint("MissingInflatedId","SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//Declaring all the components that were added to the UI to be used in the code
        val addButton = findViewById<Button>(R.id.addButton)
        val exitAppButton = findViewById<Button>(R.id.exitAppButton)
        val songDetailsButton = findViewById<Button>(R.id.songDetailsButton)
        var ratingTextNumber = findViewById<EditText>(R.id.ratingTextNumber)
        var songTitleText = findViewById<EditText>(R.id.songTitleTextText)
        var commentsText = findViewById<EditText>(R.id.commentsTextText)
        var artistNameText = findViewById<EditText>(R.id.artistNameTextText)


//Opening the add button to have code inserted to perform actions when clicked
        addButton.setOnClickListener {

            //code creating a pop-up when the button is clicked to let the user know some information
            Toast.makeText(this@MainActivity,
                "Please Enter Details for song!", Toast.LENGTH_LONG).show()

        }



//Opening the add button to have code inserted to perform actions when clicked
        songDetailsButton.setOnClickListener {

            //code to be executed when the button is clicked that will initialise a link between this page(the main page) and the secondary page
            val intent=Intent(this, DetailedViewScreen::class.java)

            //code used to obtain information from the EditTextView's and transfer it over to the secondary page
            intent.putExtra("songTitle",
                songTitleText.text.toString())
            intent.putExtra("artistName",
                artistNameText.text.toString())
            intent.putExtra("rating",
                ratingTextNumber.text.toString())
            intent.putExtra("comments",
                commentsText.text.toString())

            //code that closes the intent function for the link between the two pages to be executed
            startActivity(intent)

        }

//Opening the add button to have code inserted to perform actions when clicked
        exitAppButton.setOnClickListener {
            //code that when the button is clicked it will close the application
            finishAffinity()
        }
    }

}