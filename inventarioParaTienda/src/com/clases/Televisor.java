package com.clases;

public class Televisor extends ProductoElectrodomestico {
    // Atributos adicionales para la clase Televisor
    private double tamañoPantalla;
    private String resolución;

    // Constructor
    public Televisor(String nombre, double precio, int cantidadDisponible, double tamañoPantalla, String resolución) {
        super(nombre, precio, cantidadDisponible);  // Llamada al constructor de la clase base
        this.tamañoPantalla = tamañoPantalla;
        this.resolución = resolución;
    }

    // Sobrescribir el método mostrarInformacion()
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Llamada al método de la clase base
        System.out.println("Tamaño de Pantalla: " + tamañoPantalla + " pulgadas");
        System.out.println("Resolución: " + resolución);
    }

    // Métodos getter y setter
    public double getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(double tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getResolución() {
        return resolución;
    }

    public void setResolución(String resolución) {
        this.resolución = resolución;
    }
}
