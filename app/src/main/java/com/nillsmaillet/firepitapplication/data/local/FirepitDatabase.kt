package com.nillsmaillet.firepitapplication.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nillsmaillet.firepitapplication.data.model.Book
import com.nillsmaillet.firepitapplication.data.model.ReadingLog

@Database(
    entities = [Book::class, ReadingLog::class],
    version = 1,
    exportSchema = false
)
abstract class FirepitDatabase: RoomDatabase(){
    abstract fun bookDao(): BookDao
    abstract fun readingLog(): ReadingLogDao
}