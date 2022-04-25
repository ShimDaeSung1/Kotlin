package com.example.androidlab.section7

//데이터 클래스는 주생성자가 생성되어야 하며 매개변수가 하나 이상 선언
data class User(val no:Int, val name:String){
    //매개변수는 val이나 var을 꼭 선언

    fun main(){
        val user1=User(no=1, name= "kim")
        val user2=User(no=1, name= "kim")
        println("${user1.equals(user2)}") //data는 생성자의 값을 비교하므로 true
        println("${user1.toString()}")

        val (no, name) = user1 //user1의 no, name이 한번에 들어옴
        println("$no, $name")
    }

}