package com.example.androidlab.section4

class MyClass{
    val data1: Int
    var data2: String

    init{
        data1=10
        data2="kim"
    }
    //선언하면서 초기값을 안 줬지만 미루기 가능
    lateinit var data3: String

    //나중에 data4가 최초 선언될 때 10으로 초기화
    val data4: Int by lazy{
        println("lazy...")
        10
    }

    fun main(){
        println("main start...")
        val obj = MyClass()
        println(obj.data4)
    }
}