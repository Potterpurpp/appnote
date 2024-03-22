package com.example.appNote.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity
class Note {
    @Id
    var id:UUID?=null
    var title:String = ""
    var description:String = ""
}