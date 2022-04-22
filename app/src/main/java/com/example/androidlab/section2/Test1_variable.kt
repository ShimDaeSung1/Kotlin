package com.example.androidlab.section2

class MyClass{

    // 탑레벨에 선언한 변수는 선언하자마자 초기화 해야한다.
    val data1: Int = 10
    var data2: Int = 10

//    클래스의 멤버변수도 초기화해주고 사용해야함
    val data3 : Int = 10
    var data4 : Int = 10

    fun someFun(){
//      (함수 레벨 로컬 변수) 함수 안의 데이터를 초기화하지 않아도 가능
        val data5 : Int
        var data6 : Int

        data5 = 10
        data6 = 10
        val result = data5 + data6

    }
}