package com.dhruv.alphabetsapp.data

import com.dhruv.alphabetsapp.R
import com.dhruv.alphabetsapp.model.Alphabets

class data {
    fun loadAlpha(): List<Alphabets> {
        return listOf<Alphabets>(
            Alphabets(R.string.affirmation1, R.drawable.a),
            Alphabets(R.string.affirmation2, R.drawable.b),
            Alphabets(R.string.affirmation3, R.drawable.c),
            Alphabets(R.string.affirmation4, R.drawable.d),
            Alphabets(R.string.affirmation5, R.drawable.e),
            Alphabets(R.string.affirmation6, R.drawable.f),
            Alphabets(R.string.affirmation7, R.drawable.g),
            Alphabets(R.string.affirmation8, R.drawable.h),
            Alphabets(R.string.affirmation9, R.drawable.i),
            Alphabets(R.string.affirmation10, R.drawable.image10)
        )
    }
}