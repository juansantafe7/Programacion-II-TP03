/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;


public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.printf("Mascota: %s | Especie: %s | Edad: %d%n", nombre, especie, edad);
    }

    public void cumplirAnios() {
        edad++;
        System.out.println("🎂 ¡" + nombre + " cumplió años! Ahora tiene " + edad);
    }
}
