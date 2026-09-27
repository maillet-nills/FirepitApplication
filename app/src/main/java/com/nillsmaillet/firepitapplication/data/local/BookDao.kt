package com.nillsmaillet.firepitapplication.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.nillsmaillet.firepitapplication.data.model.Book
import com.nillsmaillet.firepitapplication.data.model.Category
import kotlinx.coroutines.flow.Flow

@Dao
interface BookDao {
    @Insert
    suspend fun insertBook(book: Book)

    @Delete
    suspend fun deleteBook(book: Book)

    @Query("SELECT * FROM books")
    fun getAllBooks(): Flow<List<Book>>

    @Query("SELECT * FROM books WHERE category = :category")
    fun getBooksByCategory(category: Category): Flow<List<Book>>
}