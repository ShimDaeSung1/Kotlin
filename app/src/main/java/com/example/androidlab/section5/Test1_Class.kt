package com.example.androidlab.section5

class User{
    var name : String = "kkang"
    fun some(){
        println("some fun call...$name")
    }
}

fun main(){
    val obj1 = User() //new연산자 없이 객체 생성
    val obj2 = User()

    obj1.name = "hello"
    obj2.name = "world"
    obj1.some()
    obj2.some()
}
