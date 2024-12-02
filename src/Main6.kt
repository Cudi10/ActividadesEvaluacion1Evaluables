import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val agenda = Agenda()
    var opcion: Int
    do {
        println("1.Añadir un contacto a la agenda")
        println("2.Listar todos los contactos de la agenda")
        println("3.Buscar un contacto")
        println("4.Existe contacto")
        println("5.Eliminar contacto")
        println("6.Contactos disponibles")
        println("7.Agenda llena")
        println("8.Salir")
        println("Escribe una de las opciones:")

        opcion = scanner.nextInt()
        scanner.nextLine()

        when (opcion) {
            1 -> {
                print("Escribe un nombre:")
                val nombre = scanner.nextLine()
                print("Escribe un teléfono:")
                val telefono = scanner.nextLine()
                val contacto = Contacto(nombre, telefono)
                agenda.ayadirContacto(contacto)
            }

            2 -> agenda.listarContactos()
            3 -> {
                print("Escribe un nombre:")
                val nombre = scanner.nextLine()
                agenda.buscarContacto(nombre)
            }

            4 -> {
                print("Escribe un nombre:")
                val nombre = scanner.nextLine()
                agenda.ExistencciaContacto(nombre)
            }
            5 -> {
                print("Escribe un nombre:")
                val nombre = scanner.nextLine()
                agenda.EliminarContacto(nombre)
            }
            6 -> agenda.HuecoLibreAgenda()
            7 -> agenda.AgendaLlena()
        }
    } while (opcion != 8)

}

data class Contacto(val nombre: String, val telefono: String)

class Agenda(private val capacidadMaxima: Int = 3) {
    private val contactos = mutableListOf<Contacto>()

    fun ayadirContacto(contacto: Contacto) {
        if (contactos.size >= capacidadMaxima) {
            println("La agenda está llena, no se pueden meter mas contactos.")
        } else if (contactos.any { it.nombre == contacto.nombre }) {
            println("El contacto con ese nombre ya existe.")
        } else {
            contactos.add(contacto)
            println("Se ha añadido el contacto")
        }
    }

    fun listarContactos() {
        if (contactos.isEmpty()) {
            println("No hay contactos que mostrar.")
        } else {
            println("Lista de contactos:")
            contactos.forEach { println("Nombre = ${it.nombre}, Teléfono = ${it.telefono}") }
        }
    }

    fun buscarContacto(nombre: String) {
        val contacto = contactos.find { it.nombre == nombre }
        if (contacto != null) {
            println("Su teléfono es ${contacto.telefono}")
        } else {
            println("No se ha encontrado al contacto.")
        }
    }

    fun ExistencciaContacto(nombre: String): Boolean {
        val existe = contactos.any { it.nombre == nombre }

        if (existe) {
            println("El contacto '$nombre' existe.")
        } else {
            println("El contacto '$nombre' no existe.")
        }

        return existe
    }

    fun EliminarContacto(nombre: String) {
        val contacto = contactos.find { it.nombre == nombre }
        if (contacto != null) {
            contactos.remove(contacto)
            println("Se ha eliminado el contacto eliminado.")
        } else {
            println("No se ha eliminado el contacto.")
        }

    }

    fun HuecoLibreAgenda(){
        val huecos = capacidadMaxima - contactos.size
        if (huecos > 0) {
            println("Hay $huecos contacto/s libre/s.")
        } else {
            println("Hay $huecos contacto/s libre/s.")
        }
    }

    fun AgendaLlena(): Boolean {
        val llena = contactos.size >= capacidadMaxima
        if (llena) {
            println("La agenda está llena.")
        } else {
            println("Aun se pueden meter contactos.")
        }
        return llena
    }


}

