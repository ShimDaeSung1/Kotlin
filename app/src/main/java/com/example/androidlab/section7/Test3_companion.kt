package com.example.androidlab.section7

class Outter1{
    //컴패니언 예약어를 붙여서 오브젝트 클래스를 만듦
    companion object CompanionObjectClass{
        var data:Int = 0
        fun someFun(){
            
        }
    }
    fun some(){
        //컴패니언을 붙이면 static처럼 바로 접근 가능하다
        CompanionObjectClass.data = 10
        CompanionObjectClass.someFun()
        
        data = 20
        someFun()
    }
}
fun main(){
    //스태틱처럼 바로 접근 가능
    Outter1.CompanionObjectClass.data=30
    Outter1.data=40
    Outter1.someFun()
}