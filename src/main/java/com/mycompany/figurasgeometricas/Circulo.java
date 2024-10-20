
package com.mycompany.figurasgeometricas;

public class Circulo extends FiguraGeometrica {
    double radio;

   
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    
    // Complejidad temporal: O(1) - Tiempo constante
    public double ObtenerArea() {
        return Math.PI * radio * radio;
    }

    // Complejidad temporal: O(1) - Tiempo constante
    public double ObtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}