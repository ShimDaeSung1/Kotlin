package com.example.androidlab.section4

class User{
    var id:Int = 0
        set(value){
            if(value<0)
                //field는 이 변수가 갖고있는 값
                field=0
            else{
                field=value
            }
        }
    //물음표는 널값을 허용한다.
    var name:String? = null
        get(){
            //field(value)가 null이면 null출력, null이 아니면 대문자 출력
            return field?.toUpperCase()
        }

    fun main(){
        var obj = User()
        //내장된 setter호출
        obj.id=10
        //내장된 getter호출
        obj.name="kkang"

        println("id: ${obj.id}, name: ${obj.name}")
    }
}