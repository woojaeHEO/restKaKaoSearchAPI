package com.exp.booksearchapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.exp.booksearchapp.data.model.Book

@Database(
    entities = [Book::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(OrmConverter::class)
abstract class BookSearchDatabase : RoomDatabase() {

    abstract fun bookSearchDao(): BookSearchDao
}