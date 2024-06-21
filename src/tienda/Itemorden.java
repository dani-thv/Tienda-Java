/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carla Daniela
 */
public class Itemorden {
    private Producto producto;
    private int cantidad;
    private List<Itemorden> items;

    private double total;
    // Constructor
    public Itemorden(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.items = new ArrayList<>();
        this.total = 0;
    }

    public Producto getProducto(){
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
    // Método para calcular el subtotal
    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }
    @Override
    public String toString() {
        return "Producto: " + producto.getNombre() + ", Cantidad: " + cantidad;
    }
    public double calcularTotal() {
        total = 0;
        for (Itemorden item : items) {
            total += item.calcularSubtotal();
        }
        return total;
    } 
}
 
