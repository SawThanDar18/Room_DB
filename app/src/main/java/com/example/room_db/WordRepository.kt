package com.example.room_db

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

class WordRepository(private val wordDao: WordDAO) {

    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}