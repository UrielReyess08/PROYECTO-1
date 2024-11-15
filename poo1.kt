class humano(private val nombre:String, private val edad:Int, private val domicilio: String, private val telefono:String)
{
    init {
        println("Esta clase ser humano tiene como nombre $nombre, tiene una edad de $edad, " +
        " vive en $domicilio y su telefono es $telefono")
    }
}
 
fun main()
{
    val humano1 = humano("Julio Perez", 25, "Las peras 123","898989")
    val humano2 = humano("Ana Gomez", 18, "Las manzanas 777","232323")
    val humano3 = humano("Carlos Diaz", 20, "Las fresas 888","353535")
}
 