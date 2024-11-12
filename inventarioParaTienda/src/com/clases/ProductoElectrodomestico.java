package com.clases;

public class ProductoElectrodomestico {
    // Atributos
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    // Constructor que inicializa todos los atributos
    public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Sobrecarga del constructor con valor por defecto para cantidadDisponible
    public ProductoElectrodomestico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = 0; // Valor por defecto
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    // Método mostrarInformacion
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad Disponible: " + cantidadDisponible);
    }
}
