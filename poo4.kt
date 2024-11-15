data class persona(val nombre: String, val edad: Int)
 
fun main(){
    val objpersona = persona("Teresa", 17)
    println(objpersona)
 
    val copia = objpersona.copy(nombre = "Quevedo", edad = 30)
    println(copia)
}