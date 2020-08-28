package siwakorn.homework.faa.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [GContact::class], version = 1, exportSchema = false)
abstract class Database : RoomDatabase(){
    abstract val databaseDao: DatabaseDAO
    companion object{
        @Volatile
        private var INSTANCE: siwakorn.homework.faa.database.Database? = null
        fun getInstance(context: Context): siwakorn.homework.faa.database.Database {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        siwakorn.homework.faa.database.Database::class.java,
                        "database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}