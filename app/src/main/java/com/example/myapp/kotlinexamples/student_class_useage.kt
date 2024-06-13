package com.example.myapp.kotlinexamples

import com.example.myapp.student

fun main() {
    var studentexample : student = student("rakesh",20,"nuzvid")
    println(studentexample.name)
    studentexample.name = "kumar"
    println("modified name is " + studentexample.name )
}