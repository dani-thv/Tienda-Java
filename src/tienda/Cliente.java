/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author Carla Daniela
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String idCliente;

    // Constructor
    public Cliente(String nombre, String apellido, String idCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idCliente = idCliente;
    }

    // Método para mostrar información
    public String mostrarInfo() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", ID Cliente: " + idCliente;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getIdCliente() {
        return idCliente;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
}
