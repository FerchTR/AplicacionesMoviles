fun sumarDosNumeros(numeroUno: Int, numeroDos: Int): Int {

    return numeroUno + numeroDos

}

fun main(args: Array<String>) {

    println("Hola mundo")
    sumarDosNumeros(1, 2)
    println(sumarDosNumeros(numeroUno = 1, numeroDos = 2))

    var nombre: String? = "Edison"
    var edad: Int = 27
    val edadActual = 28
    var casado = false
    //casado = "Edison"
    //edadActual=30
    nombre = null
    val superHeroe = if (casado) {
        "Super Mandarina"
    } else {
        "Superman"
    }
    println("superHeroe: ${superHeroe}")

    var edison = Persona(Integer(27), nombre = "Edison")
    println(edison.toString())

    when (casado) {

        true -> {
            println("Esta casado")
        }
    //null ->{println("no asignado")}
        else -> {
            println("no esta casado")
        }

    }

}

class Persona {
    lateinit var edadActual: Integer //inicializar despues indentar ctrl + a --- ctrl + alt + l
    var mNombre:String

    constructor(edad: Integer, nombre:String) {    //  ctrl + / comentar bloque
        iniciar(edad)
        mNombre = nombre

    }

fun iniciar(edad:Integer){

    edadActual = edad + 10

}
}

override fun toString():String{

    return "la edad actual es $edadActual y el nombre es $nNombre"

}
class PersonaDos(nombre:String ,edad:Integer) {

    var nEdad = edad
    var nNombre = nombre
    var nCedula:String? = null
    var nCasado:Boolean? = null
    constructor(edad2:Integer,nombre2:String,cedula:String,casado:Boolean):this(nombre2,edad2){

        nCedula=cedula
        nCasado=casado

    }
}

class PersonaTres (nombre:String,edad:Integer) {

    lateinit var nEdad:Integer
    var nNombre = nombre
    //var nCedula:String? = null
    //var nCasado:Boolean? = null
    init{
        //bloque para escribir codigo despues del constructor
        iniciar(edad)

    }

    fun iniciar (edad: Integer){
        nEdad=edad

    }

    }

open class Figura (nombre: String){
    val nNombre = nombre


}
class Cuadrado(nombre:String, valorLado:Integer):Figura(nombre){

    var nValorLado = valorLado

}