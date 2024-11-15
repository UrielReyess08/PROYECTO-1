data class personas(val nombre: String, val edad: Int)
 
fun main()
{
    val objpersona = personas("Pedro", 23)
 
    val(nom, ed) = objpersona
    println("Nombre: $nom, Edad: $ed")
}