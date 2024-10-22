fun main(){
    var edad:Int = 8

    when(edad){
        in 0..10 -> println("Es niño")
        in 11..17 -> println("Es adolescente")
        in 18...30 -> println("Es joven")
        in 31...60 -> println("Adulto")
        else -> println("Es anciano")
    }

    validarNumeroPar(20)
}

fun validarNumeroPar(n:Int) = when(n % 2){
    0 -> println("El numero $n es Par")
    else -> println("El numero $n es Impar")
}