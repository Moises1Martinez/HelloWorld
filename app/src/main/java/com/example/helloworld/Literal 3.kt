package com.example.helloworld

fun main()
{
    val prueba1 = coleccion(n1 = 1, n2 = 1, n3 = 1)
    val prueba2 = coleccion(n1 = null, n2 = 6, n3 = 6)
    val prueba3 = coleccion(n1 = 6, n2 = 4, n3 = 2)
    val prueba4 = coleccion(n1 = 3, n2 = 9, n3 = 7)
    val prueba5 = coleccion(n1 = 2, n2 = 3, n3 = 7)
    val prueba6 = coleccion(n1 = 1, n2 = 4, n3 = 1)
    val prueba7 = coleccion(n1 = 6, n2 = null, n3 = 18)
    val prueba8 = coleccion(n1 = 6, n2 = 89, n3 = null)
    val prueba9 = coleccion(n1 = 6, n2 = 2, n3 = 18)
    val prueba10 = coleccion(n1 = 34, n2 = 2, n3 = 6)


    println("test1 pasado ${prueba1==0}")
    println("test2 pasado ${prueba2==-100}")
    println("test3 pasado ${prueba3==-1}")
    println("test4 pasado ${prueba4==-2}")
    println("test5 pasado ${prueba5==12}")
    println("test6 pasado ${prueba6!=0}")
    println("test7 pasado ${prueba7==-100}")
    println("test8 pasado ${prueba8==-100}")
    println("test9 pasado ${prueba9==26}")
    println("test10 pasado ${prueba10==-1}")

}


fun coleccion(n1:Int?, n2:Int?, n3:Int?): Int
{
    var valor = 0


   // if(n1>n2 && n1>n3)
    {

        valor = -1
    }
    if(n1==n2 && n1==n2 && n2== n1 && n2==n3 && n3==n1 && n3==n2) {

        valor = 0

        return valor
    }

    else if(n1==null || n2==null || n3==null) {
        valor = -100
        return valor
    }



    else if(n1!!>n2 && n1!!> n3){
        valor=-1
        return valor


    }
    else if(n2!!>n3 && n2!!>n1){
        valor=-2
        return valor
    }
    else if(n3!!>n1 && n3!!>n2){
        valor=n1+n2+n3

    }
    return valor



}