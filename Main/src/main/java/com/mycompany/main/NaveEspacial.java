/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

public class NaveEspacial {
    private String nombre;
    private int combustible;        
    private final int capacidadMax; 

    public NaveEspacial(String nombre, int combustibleInicial, int capacidadMax) {
        this.nombre = nombre;
        this.capacidadMax = Math.max(0, capacidadMax);
        this.combustible = Math.min(Math.max(0, combustibleInicial), this.capacidadMax);
    }

    public void despegar() {
        if (combustible >= 5) {
            combustible -= 5;
            System.out.println(nombre + " despegó. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay combustible suficiente para despegar (se requieren 5).");
        }
    }


    public void avanzar(int distancia) {
        if (distancia <= 0) {
            System.out.println("Distancia inválida.");
            return;
        }
        int consumo = Math.max(1, distancia / 2);
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("Avanzó " + distancia + " (consumo " + consumo + "). Combustible: " + combustible);
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + ". Requiere " + consumo);
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad de recarga inválida.");
            return;
        }
        int nuevoNivel = combustible + cantidad;
        if (nuevoNivel > capacidadMax) {
            System.out.println("No se puede superar la capacidad (" + capacidadMax + "). Cargando hasta el máximo.");
            combustible = capacidadMax;
        } else {
            combustible = nuevoNivel;
            System.out.println("Recargó " + cantidad + ". Combustible: " + combustible);
        }
    }

    public void mostrarEstado() {
        System.out.printf("Nave: %s | Combustible: %d/%d%n", nombre, combustible, capacidadMax);
    }
}