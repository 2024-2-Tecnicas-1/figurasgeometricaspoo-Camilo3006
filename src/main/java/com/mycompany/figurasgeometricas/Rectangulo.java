
package com.mycompany.figurasgeometricas;

public class Rectangulo extends FiguraGeometrica {
     double lado1;
     double lado2;

   
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    
    // Complejidad temporal: O(1) - Tiempo constante
    public double ObtenerArea() {
        return lado1 * lado2;
    }

    // Complejidad temporal: O(1) - Tiempo constante
    public double ObtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }
}