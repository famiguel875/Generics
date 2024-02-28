/** Función genérica para invertir una lista utilizando una pila */
fun <T> reverse(lista: List<T>): List<T> {
    /** Se crea una pila para almacenar los elementos de la lista */
    val pila = Pila<T>()
    /** Se insertan los elementos de la lista en la pila */
    for (elemento in lista) {
        pila.push(elemento)
    }

    /** Lista mutable para almacenar los elementos invertidos */
    val reversedList = mutableListOf<T>()
    /** Se recorre la pila mientras no esté vacía */
    while (!pila.isEmpty()) {
        /** Se obtiene el elemento en la parte superior de la pila */
        val elemento = pila.top()
        /** Si el elemento no es nulo, se agrega a la lista invertida y se elimina de la pila */
        if (elemento != null) {
            reversedList.add(elemento)
            pila.pop()
        }
    }

    /** Se devuelve la lista invertida */
    return reversedList
}

/** Función principal */
fun main() {
    /** Prueba con una lista de strings */
    val numbers = listOf("one", "two", "three", "four")
    val numbersRev: List<String> = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)

    /** Prueba con una lista que combine valores numéricos Int, Float y Double */
    val mixedList = listOf(1, 2.0, 3f)
    val mixedListRev: List<Number> = reverse(mixedList)
    println(mixedListRev)

    /** Prueba con una lista de cualquier data class */
    val personas = listOf(Persona("Juan", 25), Persona("María", 30))
    val personasRev: List<Persona> = reverse(personas)
    println(personasRev)

    /** Prueba con una lista de tipos de datos distintos */
    val mixedDataList = listOf("hello", 42, 3.14, true)
    val mixedDataListRev: List<Any> = reverse(mixedDataList)
    println(mixedDataListRev)
}