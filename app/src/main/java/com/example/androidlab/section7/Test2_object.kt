package com.example.androidlab.section7

open class SuperClass{
    fun some1(){}
}

class Outter{
    //이름없는 오브젝트 클래스
    val obj = object{
        val data1: Int = 20
        fun some2(){

        }
    }

    //이름없는 오브젝트 클래스
    val obj2 = object : SuperClass(){
        fun some3(){

        }
    }
    object NamedObjectClass{
        fun some4(){

        }
    }
}

fun main(){
    Outter.NamedObjectClass.some4()
}