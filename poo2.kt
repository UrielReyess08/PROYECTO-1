class reloj{
    val marca = "Rolex"
    var precio = 2000.0
    lateinit var propietario: String
    val muycaro: Boolean
        get() = precio > 1000.00
    var caracteristicas: String = ""
        set(value){
            field = value
            println("Las características del reloj se modificaron con exito!!!")
        }
   
}
 
fun main(){
    val reloj1 = reloj()
    println("${reloj1.marca} - ${reloj1.precio}")
    reloj1.propietario = "Uriel Reyes"
    println("${reloj1.propietario}")
    println("${reloj1.muycaro}")
    reloj1.caracteristicas = "Rejo digital"
    println("${reloj1.caracteristicas}")
}