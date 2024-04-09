package org.example;

import java.util.PriorityQueue;

/**
 * Implementación de una cola de prioridad utilizando la clase PriorityQueue de
 * Java Collections Framework.
 * 
 * @param <E> El tipo de elementos almacenados en la cola de prioridad.
 */
public class PriorityQueueJava<E extends Comparable<E>> implements PriorityQueue2<E> {
    protected PriorityQueue<E> data; // the data, kept in heap order

    /**
     * Constructor para crear una nueva cola de prioridad basada en la clase
     * PriorityQueue.
     */
    public PriorityQueueJava() {
        data = new PriorityQueue<E>();
    }

    /**
     * Obtiene el primer elemento de la cola de prioridad sin eliminarlo.
     * 
     * @return El primer elemento de la cola de prioridad.
     * @throws IllegalStateException Si la cola de prioridad está vacía.
     */
    @Override
    public E getFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }
        return data.peek();
    }

    /**
     * Elimina y devuelve el primer elemento de la cola de prioridad.
     * 
     * @return El primer elemento de la cola de prioridad.
     * @throws IllegalStateException Si la cola de prioridad está vacía.
     */
    @Override
    public E remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }
        return data.poll();
    }

    /**
     * Agrega un elemento a la cola de prioridad.
     * 
     * @param value El elemento a agregar a la cola de prioridad.
     */
    @Override
    public void add(E value) {
        data.add(value);
    }

    /**
     * Verifica si la cola de prioridad está vacía.
     * 
     * @return true si la cola de prioridad está vacía, false de lo contrario.
     */
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Obtiene el tamaño actual de la cola de prioridad.
     * 
     * @return El tamaño actual de la cola de prioridad.
     */
    @Override
    public int size() {
        return data.size();
    }

    /**
     * Elimina todos los elementos de la cola de prioridad.
     */
    @Override
    public void clear() {
        data.clear();
    }
}
