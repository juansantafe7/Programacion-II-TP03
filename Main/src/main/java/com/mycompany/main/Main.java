/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1) Registro de Estudiantes ===");
        Estudiante e = new Estudiante("Ana", "Pérez", "Programación II", 7.5);
        e.mostrarInfo();
        e.subirCalificacion(1.0);
        e.bajarCalificacion(0.5);
        e.mostrarInfo();

        System.out.println("\n=== 2) Registro de Mascotas ===");
        Mascota m = new Mascota("Luna", "Gato", 3);
        m.mostrarInfo();
        m.cumplirAnios();
        m.mostrarInfo();

        System.out.println("\n=== 3) Encapsulamiento con Libro ===");
        Libro l = new Libro("El Arte de Programar", "Knuth", 1968);
        l.mostrarInfo();
        l.setAnioPublicacion(3000);
        l.setAnioPublicacion(1973); 
        l.mostrarInfo();

        System.out.println("\n=== 4) Gestión de Gallinas ===");
        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 1);
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();
        g2.ponerHuevo();
        g1.mostrarEstado();
        g2.mostrarEstado();

        System.out.println("\n=== 5) Simulación de Nave Espacial ===");
        NaveEspacial nave = new NaveEspacial("Orion", 50, 100);
        nave.mostrarEstado();
        nave.avanzar(20);                
        nave.despegar();
        nave.avanzar(60);
        nave.recargarCombustible(70);     
        nave.avanzar(80);
        nave.mostrarEstado();
    }
}
