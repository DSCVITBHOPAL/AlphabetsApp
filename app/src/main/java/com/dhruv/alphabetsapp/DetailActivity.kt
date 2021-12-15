package com.dhruv.alphabetsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.card.MaterialCardView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val textid = intent?.extras?.getString("text").toString()
        val words = applicationContext.resources.getStringArray(R.array.words).toList()
        Toast.makeText(this,textid, Toast.LENGTH_SHORT).show()
        val filteredwords =
            words.filter { it.startsWith(textid, ignoreCase = true) }.shuffled().take(5).sorted()
        val adapter = ArrayAdapter<String>(this,R.layout.details_item,filteredwords)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = adapter
    }
}