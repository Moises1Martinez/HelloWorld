package com.example.helloworld

fun main(){
    val res1 = sumar(1,5)
    val res2 = sumar(-5,100)
    val res3 = sumar(null,null)
    val res4 = sumar(100,10000)
    val res5 = sumar(null, 100)
    val res6 = sumar(500, null)
    val prueba7 = sumar (n1 = null, n2 = 6)
    val prueba8 = sumar (n1 = 7, n2 = 6)
    val prueba9 = sumar (n1 = 10, n2 = null)
    val prueba10 = sumar (n1 = null, n2 = null)
    println("Test1 passed ${res1==6}")
    println("Test2 passed ${res2==-1}")
    println("Test3 passed ${res3==-2}")
    println("Test4 passed ${res4==10100}")
    println("Test5 passed ${res5==100}")
    println("Test6 passed ${res6==500}")
    println("Test7 passed ${prueba7==6}")
    println("Test8 passed ${prueba8==13}")
    println("Test9 passed ${prueba9==10}")
    println("Test10 passed ${prueba10==-2}")

}

fun sumar(n1: Int?, n2: Int?):Int {
    var res = -1
    if (n1 != null && n2 != null){
        if (n1 >= 0 && n2 >= 0) {
            res = n1 + n2
        }
    }else{
        if(n1==null && n2==null){
            res=-2
        }else{
            res = if(n1!=null) n1 else n2!!
        }
    }

    return res
}