fun main(){
    var n1:Int = 50
    var n2:Int = 100
    var n3:Int = 150

    var respuesta: Int mayor(n1, n2, n3)
    var respuesta2: String = parImpar(n1)
    println("El mayor de los números $n1, n2, n3 = $respuesta")
    println("El número $n1 es $respuesta2")
}

fun mayor(tn1:Int, tn2:Int, tn3:Int):Int{
    var r:Int

    r = tn1
    if (tn2 > r)
        r = tn2
    if (tn3 > r)
        r = tn3
    return r
}

fun parImpar(tn:Int): String{
    var r:String

    if(tn1 %2 == 0)
        r = "Par"
    else
        r = "Impar"
    
    return r
}