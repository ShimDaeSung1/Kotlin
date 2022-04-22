package com.example.androidlab.section4

fun main(){
    var data1: String? = "kkang"
    
    // data1에는 null이 올 수 있기 때문에 null체크 연산자를 써줘야함 ?.
    // 만약 널 값이 올 경우 ?.가 없으면 toUpperCase를 실행 불가능하기 때문에 오류
    val result = data1?.toUpperCase()
    
    
    val result2 = data1?.run{
        //null이 아니면 실행 구문    
    }?: run{
        //null이면 실행 구문
    }
    
}