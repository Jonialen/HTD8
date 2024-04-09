package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Ingrese '1' para usar VectorHeap o '2' para usar PriorityQueue de Java Collections Framework:");
        int choice = scanner.nextInt();
        PriorityQueue2<Paciente> queue;
        switch (choice) {
            case 1:
                queue = new VectorHeap<>();
                break;
            case 2:
                queue = new PriorityQueueJava<>();
                break;
            default:
                System.out.println("Opción no válida. Usando VectorHeap por defecto.");
                queue = new VectorHeap<>();
                break;
        }

        // Leer el archivo de texto y procesar las fichas de pacientes
        try {
            File file = new File("src/main/resources/pacientes.txt");
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String nombre = parts[0].trim();
                    String descripcionSintoma = parts[1].trim();
                    char codigoEmergencia = parts[2].trim().charAt(0);
                    Paciente paciente = new Paciente(nombre, descripcionSintoma, codigoEmergencia);
                    queue.add(paciente);
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo pacientes.txt.");
            e.printStackTrace();
        }

        // Procesar la cola de pacientes
        while (!queue.isEmpty()) {
            Paciente paciente = queue.remove();
            System.out.println(paciente);
        }
    }
}