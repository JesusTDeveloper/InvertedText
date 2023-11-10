fun main() {
    // Solicita al usuario que ingrese un mensaje y obtiene el mensaje invertido.
    val invertedText= invertText("Escribe un mensaje para Invertirlo:")

    // Imprime el mensaje invertido.
    println("Mensaje invertido: $invertedText")
}

/**
 * Función que invierte un mensaje.
 *
 * @param message El mensaje inicial a mostrar antes de solicitar la entrada del usuario.
 * @return El mensaje invertido.
 */
fun invertText(message: String): String {
    // Muestra el mensaje inicial.
    println(message)

    var text: String?

    // Solicita al usuario ingresar un mensaje hasta que se proporcione un mensaje no vacío.
    do {
        text = readln()
        
        if (text.isEmpty()) {
            println("Debes ingresar un mensaje:")
        }
    } while (text.isNullOrEmpty())

    // Retorna el mensaje invertido.
    return text.reversed()
}