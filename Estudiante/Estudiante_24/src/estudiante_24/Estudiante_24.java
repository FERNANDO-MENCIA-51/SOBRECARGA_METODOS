/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante_24;

public class Estudiante_24 {
    // Atributos
    private String nombre;
    private int edad;
    private double promedio;

    // Constructor predeterminado
    public Estudiante_24() {
        nombre = "";
        edad = 0;
        promedio = 0.0;
    }

    // Constructor con nombre y edad
    public Estudiante_24(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        promedio = 0.0;
    }

    // Constructor con nombre, edad y promedio
    public Estudiante_24(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Setter para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Setter para establecer la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Setter para establecer el promedio
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Método para obtener el nombre del estudiante
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la edad del estudiante
    public int getEdad() {
        return edad;
    }

    // Método para obtener el promedio del estudiante
    public double getPromedio() {
        return promedio;
    }

    // Método para mostrar información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
    }

    // Método para determinar si el estudiante aprobó o no
    public String determinarEstado() {
        if (promedio >= 5.0) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la clase Estudiante_24
        Estudiante_24 estudiante1 = new Estudiante_24("Luis", 20, 7.5);
        Estudiante_24 estudiante2 = new Estudiante_24("Ashlyn", 22);

        estudiante2.setPromedio(4.8);

        estudiante1.mostrarInformacion();
        System.out.println("Estado: " + estudiante1.determinarEstado());

        estudiante2.mostrarInformacion();
        System.out.println("Estado: " + estudiante2.determinarEstado());
    }
}

