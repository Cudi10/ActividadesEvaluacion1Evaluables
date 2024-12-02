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

data class Contacto(val nombre: String, val telefono: String)

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

