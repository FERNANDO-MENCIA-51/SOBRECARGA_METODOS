/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_24;

/**
 *
 * @author FERNANDO
 */
public class Calculadora_24 {
    // Atributos
    private double operando1;
    private double operando2;

    // Constructor predeterminado
    public Calculadora_24() {
        operando1 = 0;
        operando2 = 0;
    }

    // Constructor con dos operandos
    public Calculadora_24(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    // Método para sumar dos números
    public double sumar() {
        return operando1 + operando2;
    }

    // Método para restar dos números
    public double restar() {
        return operando1 - operando2;
    }

    // Método para multiplicar dos números
    public double multiplicar() {
        return operando1 * operando2;
    }

    // Método para dividir dos números
    public double dividir() {
        if (operando2 != 0) {
            return operando1 / operando2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; // Valor no numérico (NaN)
        }
    }

    // Setter para establecer el primer operando
    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    // Setter para establecer el segundo operando
    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la clase Calculadora_00
        Calculadora_24 miCalculadora = new Calculadora_24(10, 5);
        
        System.out.println("Suma: " + miCalculadora.sumar());
        System.out.println("Resta: " + miCalculadora.restar());
        System.out.println("Multiplicación: " + miCalculadora.multiplicar());
        System.out.println("División: " + miCalculadora.dividir());
    }
}

