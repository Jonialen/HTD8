package org.example;

import java.util.Vector;

/**
 * Implementación de una cola de prioridad utilizando un Vector como estructura
 * subyacente.
 * 
 * @param <E> El tipo de elementos almacenados en la cola de prioridad.
 */
class VectorHeap<E extends Comparable<E>> implements PriorityQueue2<E> {

    protected Vector<E> data; // the data, kept in heap order

    /**
     * Constructor para crear una cola de prioridad basada en un Vector vacío.
     */
    public VectorHeap() {
        data = new Vector<E>();
    }

    /**
     * Constructor para crear una cola de prioridad basada en un Vector existente.
     * 
     * @param v El Vector que contiene los elementos iniciales de la cola de
     *          prioridad.
     */
    public VectorHeap(Vector<E> v) {
        int i;
        data = new Vector<E>(v.size());
        for (i = 0; i < v.size(); i++) {
            add(v.get(i));
        }
    }

    /**
     * Obtiene el índice del padre de un elemento dado en el Vector.
     * 
     * @param i El índice del elemento hijo.
     * @return El índice del padre del elemento dado.
     */
    protected static int parent(int i) {
        return (i - 1) / 2;
    }

    /**
     * Obtiene el índice del hijo izquierdo de un elemento dado en el Vector.
     * 
     * @param i El índice del elemento padre.
     * @return El índice del hijo izquierdo del elemento dado.
     */
    protected static int left(int i) {
        return 2 * i + 1;
    }

    /**
     * Obtiene el índice del hijo derecho de un elemento dado en el Vector.
     * 
     * @param i El índice del elemento padre.
     * @return El índice del hijo derecho del elemento dado.
     */
    protected static int right(int i) {
        return (2 * i + 1) + 1;
    }

    /**
     * Realiza el proceso de percolación hacia arriba para mantener la propiedad del
     * heap.
     * 
     * @param leaf El índice del elemento que ha sido agregado recientemente.
     */
    protected void percolateUp(int leaf) {
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0 && (value.compareTo(data.get(parent)) < 0)) {
            data.set(leaf, data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf, value);
    }

    /**
     * Agrega un elemento a la cola de prioridad y realiza la percolación hacia
     * arriba.
     * 
     * @param value El elemento a agregar a la cola de prioridad.
     */
    public void add(E value) {
        data.add(value);
        percolateUp(data.size() - 1);
    }

    /**
     * Realiza el proceso de empujar hacia abajo para mantener la propiedad del heap
     * a partir de la raíz.
     * 
     * @param root El índice de la raíz del heap.
     */
    protected void pushDownRoot(int root) {
        int heapSize = data.size();
        E value = data.get(root);
        while (root < heapSize) {
            int childpos = left(root);
            if (childpos < heapSize) {
                if ((right(root) < heapSize) && ((data.get(childpos + 1)).compareTo(data.get(childpos)) < 0)) {
                    childpos++;
                }
                if ((data.get(childpos)).compareTo(value) < 0) {
                    data.set(root, data.get(childpos));
                    root = childpos;
                } else {
                    data.set(root, value);
                    return;
                }
            } else {
                data.set(root, value);
                return;
            }
        }
    }

    /**
     * Elimina y devuelve el primer elemento de la cola de prioridad.
     * 
     * @return El primer elemento de la cola de prioridad.
     */
    public E remove() {
        E minVal = getFirst();
        data.set(0, data.get(data.size() - 1));
        data.setSize(data.size() - 1);
        if (data.size() > 1)
            pushDownRoot(0);
        return minVal;
    }

    /**
     * Obtiene el primer elemento de la cola de prioridad sin eliminarlo.
     * 
     * @return El primer elemento de la cola de prioridad.
     */
    public E getFirst() {
        return data.get(0);
    }

    /**
     * Verifica si la cola de prioridad está vacía.
     * 
     * @return true si la cola de prioridad está vacía, false de lo contrario.
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Obtiene el tamaño actual de la cola de prioridad.
     * 
     * @return El tamaño actual de la cola de prioridad.
     */
    public int size() {
        return data.size();
    }

    /**
     * Elimina todos los elementos de la cola de prioridad.
     */
    public void clear() {
        data.clear();
    }
}
