package com.example.androidlab.section6

//open을 선언해줘야 상속이 가능하다.
open class Super(no:Int){
    // 상위 클래스 오버라이드시 open 붙여줘야함
    open fun some(){

    }
}
//슈퍼클래스를 상속받는다. (:)
class Sub(no:Int): Super(no){
    //오버라이드시 override 붙여줘야함
    override fun some(){

    }
}