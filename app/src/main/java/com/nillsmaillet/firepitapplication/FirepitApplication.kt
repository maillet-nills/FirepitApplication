package com.nillsmaillet.firepitapplication

import android.app.Application
import androidx.room.Room
import com.nillsmaillet.firepitapplication.data.local.FirepitDatabase

class FirepitApplication : Application() {

    lateinit var database: FirepitDatabase
        private set

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            applicationContext,
            FirepitDatabase::class.java,
            "firepit_database"
        ).build()
    }
}