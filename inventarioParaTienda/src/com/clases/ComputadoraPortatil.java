package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {
    // Atributos adicionales para la clase ComputadoraPortatil
    private String marca;
    private String memoriaRAM;
    private String numeroSerie;

    // Constructor
    public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, String memoriaRAM, String numeroSerie) {
        super(nombre, precio, cantidadDisponible);  // Llamada al constructor de la clase base
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        this.numeroSerie = numeroSerie;
    }

    // Sobrescribir el método mostrarInformacion()
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Llamada al método de la clase base
        System.out.println("Marca: " + marca);
        System.out.println("Memoria RAM: " + memoriaRAM);
        System.out.println("Número de Serie: " + numeroSerie);
    }

    // Métodos getter y setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
}
