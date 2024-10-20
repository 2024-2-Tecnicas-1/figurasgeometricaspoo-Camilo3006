
package com.mycompany.figurasgeometricas;


public class Triangulo extends FiguraGeometrica {
    double base;
    double altura;

    
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

   
    // Complejidad temporal: O(1) - Tiempo constante
    public double ObtenerArea() {
        return (base * altura) / 2;
    }

    // Complejidad temporal: O(1) - Tiempo constante
    public double ObtenerPerimetro() {
      
        return 3 * base;
    }
}
