package com.example.danp_examen.entities

import androidx.room.Embedded
import androidx.room.Relation

data class UserWithPotholes(
    @Embedded
    val user: UserEntity,

    @Relation(
        parentColumn = "UseId",
        entityColumn = "PotUse",
    )
    val potholes: List<PotholeEntity>
)