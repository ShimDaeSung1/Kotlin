package com.example.androidlab.section5

class User2(val id:String, val name:String){//주생성자
    var email: String?=null
    init {
        println("init.... id:$id, name:$name")
    }
    constructor(id: String, name: String, email: String):this(id,name){
        //보조생성자나 주생성자는 하나만 선언 가능, 지금은 주생성자가 있으므로 this선언해줘야함
        println("constructor...id:$id, name:$name, email:$email")
    }
    constructor(id:String, name:String, email:String, age:String):this(id, name){
        println("constructor...id:$id, name:$name, email:$email, age:$age")
    }
    fun some(){
        println("some...id:$id, name: $name") //주 생성자에 val으로 선언 해줘야 쓸 수 있음
    }
}

fun main(){
    User2(id="1", name="hello")
    User2(id="2", name="world", email="a@a.com")
    User2(id="2", name="world", email="a@a.com", age="20")
<<<<<<< HEAD
}
=======
}
>>>>>>> 769b1ac5c998a5b72514809bec8da890e97a8635
