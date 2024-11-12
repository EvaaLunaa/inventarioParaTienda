package com;

import com.clases.*;

public class Aplicacion {
    public static void main(String[] args) {
        // Crear productos
        ProductoElectrodomestico televisor = new Televisor("Samsung TV", 500.00, 10, 55, "4K");
        ProductoElectrodomestico computadora = new ComputadoraPortatil("Dell Inspiron", 750.00, 5, "Dell", "8GB", "SN123456");

        // Crear tienda
        TiendaElectronica tienda = new TiendaElectronica();

        // Agregar productos a la tienda
        tienda.agregarProducto(televisor);
        tienda.agregarProducto(computadora);

        // Mostrar productos en el inventario
        System.out.println("Inventario de la tienda antes de las ventas:");
        tienda.mostrarProductos();

        // Realizar algunas ventas
        System.out.println("\nRealizando ventas...");
        tienda.venderProducto("Samsung TV");
        tienda.venderProducto("Dell Inspiron");
        tienda.venderProducto("Samsung TV"); // Intentar vender otro televisor

        // Mostrar productos después de las ventas
        System.out.println("\nInventario de la tienda después de las ventas:");
        tienda.mostrarProductos();

        // Intentar vender un producto que no existe
        System.out.println("\nIntentando vender un producto que no está en el inventario...");
        tienda.venderProducto("iPhone 12"); // Producto que no está en el inventario
    }
}
