package com.example.danp_examen.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "Pothole")
data class PotholeEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "PotId")
    val potId: Int = 0,

    @ColumnInfo(name = "PotUse")
    val potUser: Int,

    @ColumnInfo(name = "PotSev")
    val potSev: Int,

    @ColumnInfo(name = "PotDat")
    val potDate: Date,

    @ColumnInfo(name = "PotDes")
    val potDesc: String,
)