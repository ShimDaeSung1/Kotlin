package com.example.androidlab.section3

fun main(){

    var arg=10

    //if를 쓰면 else는 생략 불가능, 무조건 써줘야함
    var result = if(arg>20){
        println("arg>20")
        10
    }else if(arg>30){
        20
    }else{
        30
    }

    //any타입으로 선언
    val data:Any = 10
    when(data){
        //arg가 1이면
        1->println("arg is 1")
        10, 20-> println("arg")
        30->{

        }
        "hello"->println("arg hello")
        is Int -> println("arg is int")
        is String -> println("String")
        else-> println("else")
    }
}