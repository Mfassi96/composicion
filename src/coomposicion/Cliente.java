/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coomposicion;

/**
 *
 * @author mauro
 */
public class Cliente {
    
    private String nombre;
    private String apellidopaterno;
    private String apellidomaterno;
    
    // objetos como atributos de la clase
    private Fechanacimiento fechaNacimiento;
    private Direccion direccion;

    public Cliente(String nombre, String apellidopaterno, String apellidomaterno, Fechanacimiento fechaNacimiento, Direccion direccion) {
        this.nombre = nombre;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public Fechanacimiento getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fechanacimiento fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("\n");
        sb.append(nombre);
        sb.append("\n");
        sb.append(apellidopaterno);
        sb.append("\n");
        sb.append(apellidomaterno);
        sb.append("\n");
        sb.append(fechaNacimiento);
        sb.append("\n");
        sb.append(direccion);
        sb.append("\n");
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}

