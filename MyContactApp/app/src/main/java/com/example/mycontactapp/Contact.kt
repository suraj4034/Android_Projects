package com.example.mycontactapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts")
data class Contact(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val phoneNumber: String,
    val image:String,
    val email:String
)
