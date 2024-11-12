package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
    // Atributo que almacena los productos
    private ArrayList<ProductoElectrodomestico> listaDeProductos;

    // Constructor
    public TiendaElectronica() {
        listaDeProductos = new ArrayList<>();
    }

    // Método para agregar un producto al inventario
    public void agregarProducto(ProductoElectrodomestico producto) {
        listaDeProductos.add(producto);
    }

    // Método para mostrar todos los productos
    public void mostrarProductos() {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            producto.mostrarInformacion();
            System.out.println("----------");
        }
    }

    // Método para buscar un producto por su nombre
    public ProductoElectrodomestico buscarProducto(String nombre) {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    // Método para realizar una venta
    public void venderProducto(String nombre) {
        ProductoElectrodomestico producto = buscarProducto(nombre);
        if (producto != null) {
            if (producto.getCantidadDisponible() > 0) {
                producto.setCantidadDisponible(producto.getCantidadDisponible() - 1);
                System.out.println("Venta realizada de: " + producto.getNombre());
            } else {
                System.out.println("Producto agotado: " + producto.getNombre());
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}
