package com.example.imadpracticum1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

            data class Song(val title: String, val artist: String, val duration: String)



                val showSongsBtn = findViewById<Button>(R.id.showSongsBtn)
                val songListTextView = findViewById<TextView>(R.id.songListTextView)

                val songs = listOf(
                    Song("Shape of You", "Ed Sheeran", "3:53"),
                    Song("Blinding Lights", "The Weeknd", "3:20"),
                    Song("Levitating", "Dua Lipa", "3:23"),
                    Song("Senorita", "Shawn Mendes & Camila Cabello", "3:10")
                )

                showSongsBtn.setOnClickListener {
                    val builder = StringBuilder()
                    for ((index, song) in songs.withIndex()) {
                        builder.append("${index + 1}. ${song.title}\n")
                        builder.append("   Artist: ${song.artist}\n")
                        builder.append("   Duration: ${song.duration}\n\n")
                    }
                    songListTextView.text = builder.toString()
                }
            }
        }

