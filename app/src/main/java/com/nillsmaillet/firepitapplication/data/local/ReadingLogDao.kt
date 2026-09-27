package com.nillsmaillet.firepitapplication.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.nillsmaillet.firepitapplication.data.model.ReadingLog
import kotlinx.coroutines.flow.Flow

@Dao
interface ReadingLogDao {
    @Insert
    suspend fun insertLog(readingLog: ReadingLog)

    @Update
    suspend fun updateLog(readingLog: ReadingLog)

    @Delete
    suspend fun deleteLog(readingLog: ReadingLog)

    @Query("SELECT * FROM reading_logs WHERE bookId = :bookId ORDER BY date ASC")
    fun getLogsByBook(bookId: Int): Flow<List<ReadingLog>>

    @Query("SELECT * FROM reading_logs WHERE bookId = :bookId ORDER BY date DESC LIMIT 1")
    fun getLatestLogByBook(bookId: Int): Flow<ReadingLog?>

    @Query("SELECT * FROM reading_logs ORDER BY date DESC")
    fun getAllLogs(): Flow<List<ReadingLog>>
}