fun main(){

 println("1.Añadir un contacto a la agenda\n")
 println("2.Listar todos los contactos de la agenda\n")
 println("3.Buscar un contacto\n")
 println("4.Existe contacto\n")
 println("5.Eliminar contacto\n")
 println("6.Contactos disponibles\n")
 println("7.Agenda llena\n")
 println("8.Salir\n")
 println("Escribe una de las opciones:")

}

data class Contacto(var nombre: String, var telefono: String)

class Agenda(private val capacidadMaxima: Int = 3) {
    private val contactos = mutableListOf<Contacto>()

    fun ayadirContacto(contacto: Contacto) {
        if (contactos.size >= capacidadMaxima) {
            println("La agenda está llena, no se pueden meter mas contactos.")
        } else if (contactos.any { it.nombre == contacto.nombre }) {
            println("El contacto con ese nombre ${contacto.nombre} ya existe.")
        } else {
            contactos.add(contacto)
            println("Se ha añadido el contacto: ${contacto.nombre}")
        }
    }

    fun listarContactos() {
        if (contactos.isEmpty()) {
            println("No hay contactos que mostrar.")
        } else {
            println("Lista de contactos:")
            contactos.forEach { println("Nombre: ${it.nombre}, Teléfono: ${it.telefono}") }
        }
    }

    fun BuscarContacto(){

    }

    fun ExistencciaContacto(){

    }

    fun EliminarContacto(){

    }

    fun HuecoLibreAgenda(){

    }

    fun AgendaLlena(){

    }

    fun Salir(){

    }
}

