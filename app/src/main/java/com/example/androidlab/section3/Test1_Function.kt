package com.example.androidlab.section3

fun main(){
    //$는 바로 변수의 값을 읽어와주고, arg2:String = "kkang"은 매개변수의 defualt값이다. 전달이 안 됐을 경우 kkang으로 들어온다.
    fun myFun(arg1: Int, arg2 : String = "kkang") = println("arg1 : $arg1, arg2: $arg2")

    myFun(arg1=10) //arg2는 default값 선언
    myFun(arg1=10, arg2="kim")
    myFun(arg2 = "lee", arg1 = 20) //명시하면 순서 맞추지 않아도 무방

    //외부에서 이 함수를 호출 시 매개변수의 개수가 예측이 안 될 경우
    fun myFun2(arg1: Int, vararg arg2:Int){
        //vararg는 가변인수, 배열로 이용됨
        for(a in arg2){
            print(a)
        }
    }
//    myFun2(arg1=10, arg2=20,22) // arg2는 가변인수기 때문에 몇개를 주더라도 상관없다.

}
