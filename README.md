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