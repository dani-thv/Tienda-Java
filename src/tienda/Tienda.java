/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carla Daniela
 */
public class Tienda {
    private List<Producto> productos;
    private List<Cliente> clientes;
    private List<Itemorden> items;
    private List<Categoria> categorias;

    // Constructor
    public Tienda() {
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.items = new ArrayList<>();
        this.categorias = new ArrayList<>();
    }

    // Método para registrar un producto
    public void registrarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para registrar un cliente
    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Método para mostrar productos
    public List<String> mostrarProductos() {
        List<String> infoProductos = new ArrayList<>();
        for (Producto producto : productos) {
            infoProductos.add(producto.mostrarInfo());
        }
        return infoProductos;
    }
}
      
