fun main(){
    var n1: Double = 7.8
    var n2: Double = 5.6
    var n3: Double = 1.3

    var respuesta:Double = promedio (n1,n2,n3)
    println("el promedio de $n1, $n2 y $n3 es = $respuesta")
}

fun promedio(tn1:Double, tn2:Double, tn3:Double): Double{
    var pr:Double
    pr = (tn1 + tn2 + tn3)/3
    return pr
}