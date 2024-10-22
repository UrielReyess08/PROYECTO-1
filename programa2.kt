fun main(){
    var nombre: String = "Uriel Reyes"
    var cotorona: Double = 45.0
    var horasTrabajadas: Double = 60.0
    var descuento: Double = fdescuento(costoHora, horasTrabajadas)
    var salario: Double = fsalario(costoHora, horasTrabajadas, descuento)
    println("El salario del trabajador: $nombre es salario, con horas trabajadas: $horasTrabajadas," +
    "Con un pago por hora de: $costoHora, y un descuento de: $descuento")
}

fun fdescuento(ch:Double, ht:Double):Double{
    var d: Double
    d = (ch * ht) * 0.15
    return d
}

fun fsalario(ch:Double, ht:Double, d:Double):Double{
    var s:Double

    s = (ch * ht) - d
    return s
}