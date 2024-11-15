open class forma(val nombre:String){
    open fun area() = 0.0
}
 
class circulo(nombre:String, val radio: Double): forma(nombre) {
    override fun area() = Math.PI * Math.pow(radio, 2.0)
 
}
 
class cuadrado(nombre:String, val lado: Double): forma(nombre){
    override fun area() = lado * lado
}
 
class circunferencia(nombre:String, val radio: Double): forma(nombre){
    override fun area() = 2.0 * Math.PI * radio
}
fun main(){
    val circulo = circulo("Circulo", 7.0)
    println(circulo.nombre )
    println(circulo.radio )
    println(circulo.area() )
 
    val cuadrado = cuadrado("Cuadrado", 5.0)
    println(cuadrado.nombre)
    println(cuadrado.lado )
    println(cuadrado.area() )
 
    val circunferencia = circunferencia("Circunferencia", 5.0)
    println("Nombre : ${circunferencia.nombre}")
    println("Valor del Radio : ${circunferencia.radio}" )
    println("Longitud de la circunferencia = ${circunferencia.area()}")
}