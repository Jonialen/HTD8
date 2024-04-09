package org.example;

/**
 * Clase que representa a un paciente en un sistema de gestión de emergencias.
 */
class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String descripcionSintoma;
    private char codigoEmergencia;

    /**
     * Constructor para la clase Paciente.
     * 
     * @param nombre             El nombre del paciente.
     * @param descripcionSintoma La descripción del síntoma del paciente.
     * @param codigoEmergencia   El código de emergencia del paciente.
     */
    public Paciente(String nombre, String descripcionSintoma, char codigoEmergencia) {
        this.nombre = nombre;
        this.descripcionSintoma = descripcionSintoma;
        this.codigoEmergencia = codigoEmergencia;
    }

    /**
     * Obtiene el nombre del paciente.
     * 
     * @return El nombre del paciente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la descripción del síntoma del paciente.
     * 
     * @return La descripción del síntoma del paciente.
     */
    public String getDescripcionSintoma() {
        return descripcionSintoma;
    }

    /**
     * Obtiene el código de emergencia del paciente.
     * 
     * @return El código de emergencia del paciente.
     */
    public char getCodigoEmergencia() {
        return codigoEmergencia;
    }

    /**
     * Método de comparación para ordenar los pacientes por su código de emergencia.
     * 
     * @param otro El otro paciente con el que comparar.
     * @return Un valor negativo si este paciente tiene un código de emergencia
     *         menor que el otro,
     *         un valor positivo si este paciente tiene un código de emergencia
     *         mayor que el otro,
     *         y cero si los códigos de emergencia son iguales.
     */
    @Override
    public int compareTo(Paciente otro) {
        return Character.compare(this.codigoEmergencia, otro.codigoEmergencia);
    }

    /**
     * Retorna una representación en forma de cadena de texto del paciente.
     * 
     * @return Una cadena de texto que representa el paciente.
     */
    @Override
    public String toString() {
        return nombre + ", " + descripcionSintoma + ", " + codigoEmergencia;
    }
}
