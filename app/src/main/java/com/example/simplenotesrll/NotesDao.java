package com.example.simplenotesrll;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface NotesDao {
    @Query("SELECT * FROM NOTES ORDER BY dayOfWeek")
    LiveData<List<Note>> getAllNotes();

    @Insert
    void insertNote(Note note);

    @Query("DELETE FROM notes")
    void deleteAllNotes();

    @Delete
    void deleteNote(Note note);

}
