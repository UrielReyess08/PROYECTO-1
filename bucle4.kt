fun main(){
    var s:Int = 0
    for (c in 1..50)
    {
        if (c % 2 == 0)
        {
            println(c)
            s+=c
        }
    }
    println("La suma de los números pares es = $s")
}