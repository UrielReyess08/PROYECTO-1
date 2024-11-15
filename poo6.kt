interface ivehiculomotor{
    val modelo: String
    val velocidadmax: Float
    fun acelerar(incremento: Float)
    fun frenar(decremento: Float)
}
 
class vehiculo(override val modelo: String, override val velocidadmax: Float)
    : ivehiculomotor{
        var velocidadact = 0f
        override fun acelerar(incremento: Float){
            if(velocidadact + incremento > velocidadmax)
               velocidadact = velocidadmax
            else
                velocidadact += incremento
            println("Acelerar: $velocidadact")
        }
        override fun frenar(decremento: Float){
            if(velocidadact - decremento < 0)
                velocidadact = 0f
            else
                velocidadact -= decremento
            println("Frenar: $velocidadact")
        }
 
    }
 
fun main(){
    val objvehiculo = vehiculo("Ferrari", 200f)
    objvehiculo.acelerar(50f)
    objvehiculo.frenar(40f)
}
 