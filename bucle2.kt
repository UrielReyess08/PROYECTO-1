fun main(){
    var s:Int = 0
    var c:Int 

    for(c in 1..50){
        if (c % 2 == 0){
            println(c)
            s+=c
        }
    }
    println("la suma de los pares mostrados es: $s")
}