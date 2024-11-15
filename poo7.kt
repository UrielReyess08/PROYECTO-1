data class Item(val id: Int, val price: Precio, val qty: Int)
inline class Precio(val price: Float) {
    inline fun toDollars(): Float = price / 3.70f
}
 
fun main()
{
    val objproducto = Item(1, Precio(200f),5)
    println(objproducto)
 
    val objproducto2 = Item(2, Precio( 100f) , 5)
    println(objproducto2)
    println(objproducto2.price.toDollars())
 
}