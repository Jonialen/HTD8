package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class VectorHeapTest {

    private VectorHeap<Paciente> vectorHeap;

    @Before
    public void setUp() {
        vectorHeap = new VectorHeap<>();
    }

    @Test
    public void testAdd() {
        Paciente p1 = new Paciente("Juan", "Fiebre", 'A');
        Paciente p2 = new Paciente("Maria", "Dolor de cabeza", 'B');
        vectorHeap.add(p1);
        vectorHeap.add(p2);

        assertEquals(2, vectorHeap.size());
        assertEquals(p1, vectorHeap.getFirst());
    }

    @Test
    public void testRemove() {
        Paciente p1 = new Paciente("Juan", "Fiebre", 'A');
        Paciente p2 = new Paciente("Maria", "Dolor de cabeza", 'B');
        vectorHeap.add(p1);
        vectorHeap.add(p2);

        assertEquals(p1, vectorHeap.remove());
        assertEquals(1, vectorHeap.size());
        assertEquals(p2, vectorHeap.getFirst());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(vectorHeap.isEmpty());

        vectorHeap.add(new Paciente("Juan", "Fiebre", 'A'));

        assertFalse(vectorHeap.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, vectorHeap.size());

        vectorHeap.add(new Paciente("Juan", "Fiebre", 'A'));
        vectorHeap.add(new Paciente("Maria", "Dolor de cabeza", 'B'));

        assertEquals(2, vectorHeap.size());
    }

    @Test
    public void testClear() {
        vectorHeap.add(new Paciente("Juan", "Fiebre", 'A'));
        vectorHeap.add(new Paciente("Maria", "Dolor de cabeza", 'B'));

        vectorHeap.clear();

        assertTrue(vectorHeap.isEmpty());
        assertEquals(0, vectorHeap.size());
    }
}
