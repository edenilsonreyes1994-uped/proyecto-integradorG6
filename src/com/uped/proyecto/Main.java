package com.uped.proyecto;

// Importamos todas las clases del modelo
import com.uped.proyecto.modelo.*;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- 1. Prueba de Upcasting (Apartado 5.6) ---");
        // Creación del arreglo de tipo Persona con las subclases[cite: 31, 32]
        Persona[] personas = {
            new Cliente("Ana", "0451...", "7777-1", 4000.0),
            new Empleado("Luis", "0622...", 850.0),
            new Estudiante("Kevin", "0399...", "UPED-045", "Ing. Sistemas", 9.1)
        };

        // Recorrido del arreglo invocando el método abstracto[cite: 31, 32]
        for (Persona p : personas) {
            System.out.println(p.presentarse() + " -> $" + p.calcularBeneficioAnual());
        }

        System.out.println("\n--- 2. Prueba Ejemplo Integrador: Voluntario (Apartado 7) ---");
        // Prueba específica para la clase Voluntario
        Voluntario v = new Voluntario("Sara Gómez", "07456123-2", 120.0);
        System.out.println(v);
        System.out.println("Beneficio: " + v.calcularBeneficioAnual());

        System.out.println("\n--- 3. Prueba Ejercicio Práctico 1: Proveedor (Apartado 8.2) ---");
        // Prueba específica para la nueva clase Proveedor
        Proveedor prov = new Proveedor("Comercial Ríos", "06554321-8", 8000.0);
        System.out.println(prov);
        System.out.println("Beneficio: " + prov.calcularBeneficioAnual());
    }
}