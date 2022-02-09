package com.example.helloworld


fun main(){
    var caso1 = generarArreglo(3)
    print(caso1)
}

fun generarArreglo(n:Int): ArrayList<ArrayList<Int>>{
    var res = ArrayList<ArrayList<Int>>() // [] [[1,2],[2,2]]
    var subitem = ArrayList<Int>()
    for(i in 0 until n){
        subitem.add(n)
    }
    for(i in 0 until n){
        //item == [2,2]
        res.add(subitem)
    }
    var item = ArrayList<Int>()
    item.add(n*n*n)
    res.add(item)
    return res
}