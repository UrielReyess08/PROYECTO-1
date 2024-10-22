fun main(){
    val x: String "abc"

    try{
        val x1 = x.toInt()
        println(x1)
    }
    catch (e: Exception)
    {
        println("Hubo error en la conversion")
    }
}