package com.example;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        Producto producto1 = new Producto("x6'lap", 1500.00, 10);
        Producto producto2 = new Producto("raton244", 25.00, 5);
        Producto producto3 = new Producto("Teclado", 50.00, 0);

        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);

        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
        producto3.mostrarInformacion();

        double valorTotal = tienda.calcularValorTotalInventario();
        System.out.println("Valor total del inventario: " + valorTotal);

        tienda.mostrarProductosConStockBajo(3);
    }
}
