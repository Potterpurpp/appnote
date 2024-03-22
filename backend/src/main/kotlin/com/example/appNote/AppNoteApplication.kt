package com.example.appNote

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AppNoteApplication

fun main(args: Array<String>) {
	runApplication<AppNoteApplication>(*args)
}
