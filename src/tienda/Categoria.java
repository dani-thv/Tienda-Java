/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author Carla Daniela
 */
public class Categoria {
    private String nombre;

    // Constructor
    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    // Método para mostrar información
    public String mostrarInfo() {
        return "Nombre: " + nombre;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
