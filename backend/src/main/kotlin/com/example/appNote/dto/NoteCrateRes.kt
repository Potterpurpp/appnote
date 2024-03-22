package com.example.appNote.dto

import java.util.UUID

data class NoteCrateRes(
        var id:UUID,
        var title:String,
        var description:String
)