/** Clase genérica Pila que implementa la interfaz Iterable para permitir el uso de iteradores */
class Pila<T> : Iterable<T> {
    /** Lista mutable para almacenar los elementos de la pila */
    private val elementos = mutableListOf<T>()

    /** Método para insertar un elemento en la pila (push) */
    fun push(elemento: T) {
        elementos.add(elemento)
    }

    /** Método para eliminar y devolver el elemento en la parte superior de la pila (pop) */
    fun pop(): T? {
        if (isEmpty())
            return null
        return elementos.removeAt(elementos.size - 1)
    }

    /** Método para devolver el elemento en la parte superior de la pila sin eliminarlo (top) */
    fun top(): T? {
        if (isEmpty())
            return null
        return elementos[elementos.size - 1]
    }

    /** Método para verificar si la pila está vacía */
    fun isEmpty(): Boolean {
        return elementos.isEmpty()
    }

    /** Método necesario para implementar Iterable, devuelve un iterador sobre los elementos de la pila */
    override fun iterator(): Iterator<T> {
        return elementos.iterator()
    }
}