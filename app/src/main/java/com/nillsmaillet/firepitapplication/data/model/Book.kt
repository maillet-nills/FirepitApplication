package com.nillsmaillet.firepitapplication.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "books")
data class Book(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val synopsis: String,
    val author: String,
    val pages: Int,
    val genre: String,
    val category: Category
)
