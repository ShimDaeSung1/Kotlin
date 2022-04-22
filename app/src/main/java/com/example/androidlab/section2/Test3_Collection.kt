package com.example.androidlab.section2

fun main(){
    //타입을 명시하지 않으므로 기본형 any타입으로 들어간다.
    val array1 = arrayOf(10, 20, true, "hello")
    array1[2] = false
    array1.get(1)

    val array2 = arrayOf<Int>(10, 20)
    val array3 = intArrayOf(10, 20)

    //배열만 선언할 경우 배열 클래스 직접 생산
    //초기값은 이 함수가 호출되고, 리턴값이 초기값이 됨
    Array(size=3, { i -> i*10} )

    val array4 = arrayOfNulls<Int>(size=4)

    val array5 = Array(size=3, { 0 })
    val array6 = IntArray( size = 2 )
}