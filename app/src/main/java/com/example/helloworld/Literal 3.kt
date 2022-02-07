package com.example.helloworld

fun main(){
    var caso1: Array<Int> = arrayOf(1, 2, 5, 9)
    var caso2: Array<Int> = arrayOf(1, 2, 5, 9)
    var caso3: Array<Int> = arrayOf(1, 2, 5, 9,15, 50, 100, 50)
    var caso4: Array<Int> = arrayOf(7, 9, 6)
    var caso5: Array<Int> = arrayOf(6,8,9,3,2)
    var caso6: Array<Int> = arrayOf(7,8,6,2,6,45)
    var caso7: Array<Int> = arrayOf(5,2,0,6,4)
    var caso8: Array<Int> = arrayOf(1,2,3,4)
    var caso9: Array<Int> = arrayOf(9,8,7,6)
    var caso10: Array<Int> = arrayOf(4,5,6,7)
    var res1 = searchData(caso1, 1) //0
    var res2 = searchData(caso2, 9) //3
    var res3 = searchData(caso3, 100) //6
    var res4 = searchData(caso4, 6) //2
    var res5 = searchData(caso5, 6)
    var res6 = searchData(caso6, 7)
    var res7 = searchData(caso7, 0)
    var res8 = searchData(caso8, 4)
    var res9 = searchData(caso9, 7)
    var res10 = searchData(caso10, 5)
    println("searchData(caso1, n=1) Test passed ${res1==0}")
    println("searchData(caso2, n=9) Test passed ${res2==3}")
    println("searchData(caso3, n=100) Test passed ${res3==6}")
    println("searchData(caso4, n=6) Test passed ${res4==2}")
    println("searchData(caso5, n=6) Test passed ${res5==0}")
    println("searchData(caso6, n=7) Test passed ${res6==0}")
    println("searchData(caso7, n=0) Test passed ${res7==2}")
    println("searchData(caso8, n=4) Test passed ${res8==3}")
    println("searchData(caso9, n=7) Test passed ${res9==2}")
    println("searchData(caso10, n=5) Test passed ${res10==1}")
}
fun searchData(colleccion:Array<Int>, number: Int):Int{
    var pos=0
    for(i in colleccion){
        if(i==number){
            return pos
        }
        pos += 1
    }
    return -1
}
