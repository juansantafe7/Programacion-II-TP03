/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

public class Gallina {
    private int idGallina;
    private int edad;         
    private int huevosPuestos;

    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("🥚 Gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    public void envejecer() {
        edad++;
        System.out.println("⏳ Gallina " + idGallina + " envejeció. Edad: " + edad);
    }

    public void mostrarEstado() {
        System.out.printf("Gallina #%d | Edad: %d | Huevos puestos: %d%n",
                idGallina, edad, huevosPuestos);
    }
}