package org.example;

interface PriorityQueue2<E extends Comparable<E>> {
    E getFirst();

    E remove();

    void add(E value);

    boolean isEmpty();

    int size();

    void clear();
}