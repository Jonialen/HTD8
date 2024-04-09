package org.example;

/**
 * Interfaz que define la estructura de una cola de prioridad genérica.
 * 
 * @param <E> El tipo de elementos almacenados en la cola de prioridad.
 */
interface PriorityQueue2<E extends Comparable<E>> {

    /**
     * Obtiene el primer elemento de la cola de prioridad sin eliminarlo.
     * 
     * @return El primer elemento de la cola de prioridad.
     */
    E getFirst();

    /**
     * Elimina y devuelve el primer elemento de la cola de prioridad.
     * 
     * @return El primer elemento de la cola de prioridad.
     */
    E remove();

    /**
     * Agrega un elemento a la cola de prioridad.
     * 
     * @param value El elemento a agregar a la cola de prioridad.
     */
    void add(E value);

    /**
     * Verifica si la cola de prioridad está vacía.
     * 
     * @return true si la cola de prioridad está vacía, false de lo contrario.
     */
    boolean isEmpty();

    /**
     * Obtiene el tamaño actual de la cola de prioridad.
     * 
     * @return El tamaño actual de la cola de prioridad.
     */
    int size();

    /**
     * Elimina todos los elementos de la cola de prioridad.
     */
    void clear();
}
