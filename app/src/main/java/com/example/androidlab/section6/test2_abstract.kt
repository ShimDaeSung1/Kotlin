package com.example.androidlab.section6


abstract class Super1{
    abstract val data1:String
    open fun some1(){

    }
    //미완성 함수
    abstract fun some2()

    open fun some3(){

    }
}

//인터페이스는 추상함수 선언이 목적이지만 정상함수도 선언 가능
interface MyInterface {
    val data1: String

    fun some4(){

    }
    fun some5()
}

class sub : Super1(), MyInterface{
    override fun some2() {
    }

    override fun some5() {
        TODO("Not yet implemented")
    }

    override val data1: String
        get() = TODO("Not yet implemented")

}