package com.example.androidlab.section3

fun main(){
    //10부터 1까지 2씩 줄어든다.
    for(i in 10 downTo 1 step 2){
        println(i)
    }

    val array = arrayOf("hello", "world")
    // key와 value로 받아올 수 있음
    for ((index, value) in array.withIndex()){

    }

    val map = mapOf<String, String>("one" to "hello", "two" to "world")
    for(item in map){
        println("key:${item.key}, value: ${item.value}")
    }
}