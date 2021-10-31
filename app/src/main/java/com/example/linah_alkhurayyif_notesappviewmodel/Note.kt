package com.example.linah_alkhurayyif_notesappviewmodel

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "NotesTable")
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val noteText: String)
