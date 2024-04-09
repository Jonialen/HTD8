package org.example;

import java.util.PriorityQueue;

public class PriorityQueueJava<E extends Comparable<E>> implements PriorityQueue2<E> {
    protected PriorityQueue<E> data; // the data, kept in heap order

    public PriorityQueueJava() {
        data = new PriorityQueue<E>();
    }

    @Override
    public E getFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }
        return data.peek();
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }
        return data.poll();
    }

    @Override
    public void add(E value) {
        data.add(value);
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public void clear() {
        data.clear();
    }
}