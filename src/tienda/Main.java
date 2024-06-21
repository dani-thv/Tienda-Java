/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import Ventanas.Interfaz;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carla Daniela
 */
public class Main {
    public static List<Cliente> listaClientes = new ArrayList<>();
    public static List<Producto> listaProductos = new ArrayList<>();
    public static List<Itemorden> listaItemordenes = new ArrayList<>(); 
    public static void main(String[] args) {
            listaClientes.add(new Cliente("Juan", "Perez", "001"));
            listaClientes.add(new Cliente ("Maria", "Gonzalez", "002"));
            listaClientes.add(new Cliente ("Pedro", "Martinez", "003"));
            listaClientes.add(new Cliente("Ana", "Lopez", "004"));
            listaClientes.add(new Cliente("Carlos", "Garcia", "005"));
            listaClientes.add(new Cliente("Luisa", "Rodriguez", "006"));
            listaClientes.add(new Cliente("Javier", "Sanchez", "007"));
            listaClientes.add(new Cliente("Laura", "Diaz", "008"));
            listaClientes.add(new Cliente("Miguel", "Hernandez", "009"));
            listaClientes.add(new Cliente("Sofia", "Torres", "010"));

            listaProductos.add(new Producto("Arroz", 5000.0, "Despensa"));
            listaProductos.add(new Producto("Huevos", 16000.0, "Despensa"));
            listaProductos.add(new Producto("Azúcar", 4800.0, "Despensa"));
            listaProductos.add(new Producto("Leche", 3000.0, "Lácteos"));
            listaProductos.add(new Producto("Queso", 12000.0, "Lácteos"));
            listaProductos.add(new Producto("Yogur", 4000.0, "Lácteos"));
            listaProductos.add(new Producto("Pan", 2500.0, "Panadería"));
            listaProductos.add(new Producto("Carne de res", 25000.0, "Carnicería"));
            listaProductos.add(new Producto("Pollo", 15000.0, "Carnicería"));
            listaProductos.add(new Producto("Pescado", 18000.0, "Pescadería"));
            listaProductos.add(new Producto("Manzanas", 3500.0, "Frutas y Verduras"));
            listaProductos.add(new Producto("Plátanos", 3000.0, "Frutas y Verduras"));
            listaProductos.add(new Producto("Zanahorias", 2000.0, "Frutas y Verduras"));
            listaProductos.add(new Producto("Cereal", 8000.0, "Despensa"));
            listaProductos.add(new Producto("Jugo de naranja", 6000.0, "Bebidas"));
            listaProductos.add(new Producto("Galletas", 4500.0, "Snacks"));
            listaProductos.add(new Producto("Papas fritas", 3000.0, "Snacks"));
            listaProductos.add(new Producto("Refresco", 2500.0, "Bebidas"));
            listaProductos.add(new Producto("Jabón", 2000.0, "Higiene"));
            listaProductos.add(new Producto("Shampoo", 7000.0, "Higiene"));


            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
}
