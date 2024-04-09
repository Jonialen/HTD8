# HDT8
# Gestor de Emergencias - Programa de Colas de Prioridad

Este es un programa Java que implementa un gestor de emergencias utilizando colas de prioridad. El programa permite gestionar fichas de pacientes según la gravedad de sus síntomas, utilizando diferentes estructuras de datos para la cola de prioridad.

## Funcionalidades

- Leer fichas de pacientes desde un archivo de texto.
- Agregar pacientes a la cola de prioridad según la gravedad de sus síntomas.
- Mostrar la información de los pacientes atendidos en orden de prioridad.

## Estructuras de Datos Implementadas

El programa implementa dos estructuras de datos para la cola de prioridad:

1. **VectorHeap**: Implementación de una cola de prioridad utilizando un Vector como estructura subyacente.
2. **PriorityQueueJava**: Implementación de una cola de prioridad utilizando la clase PriorityQueue de Java Collections Framework.

## Cómo Ejecutar el Programa

1. Clona este repositorio o descarga el código fuente.
2. Asegúrate de tener configurado un entorno de desarrollo Java (JDK).
3. Compila el programa ejecutando el siguiente comando en la terminal:

   ```
   javac -d out src/**/*.java
   ```

4. Ejecuta el programa con el siguiente comando:

   ```
   java -cp out org.example.Main
   ```

5. Sigue las instrucciones en pantalla para seleccionar la estructura de datos para la cola de prioridad y observa la información de los pacientes atendidos.

## Archivo de Fichas de Pacientes

El programa espera leer las fichas de pacientes desde un archivo de texto llamado `pacientes.txt`. Cada línea del archivo debe tener el siguiente formato:

```
Nombre del Paciente, Descripción del Síntoma, Código de Emergencia
```

Por ejemplo:

```
Juan Perez, Dolor de cabeza severo, A
Maria Lopez, Fiebre alta, C
```

## Dependencias

El programa no tiene dependencias externas más allá de las bibliotecas estándar de Java.

---

Puedes personalizar este README según las necesidades específicas de tu programa y añadir más detalles o secciones según sea necesario.