/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coomposicion;

/**
 *
 * @author mauro
 */
public class Direccion {
    private String calle;
    private String numeroExeterno;
    private String numeroInterno;
    private int cp;
    private String ciudad;

    public Direccion(String calle, String numeroExeterno, String numeroInterno, int cp, String ciudad) {
        this.calle = calle;
        this.numeroExeterno = numeroExeterno;
        this.numeroInterno = numeroInterno;
        this.cp = cp;
        this.ciudad = ciudad;
    }
    
    
    

    public Direccion(String calle, String numeroExeterno, int cp, String ciudad) {
        this.calle = calle;
        this.numeroExeterno = numeroExeterno;
        this.cp = cp;
        this.ciudad = ciudad;
    }
    
    

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroExeterno() {
        return numeroExeterno;
    }

    public void setNumeroExeterno(String numeroExeterno) {
        this.numeroExeterno = numeroExeterno;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Direccion{");
        sb.append("calle=").append(calle);
        sb.append(", numeroExeterno=").append(numeroExeterno);
        sb.append(", numeroInterno=").append(numeroInterno);
        sb.append(", cp=").append(cp);
        sb.append(", ciudad=").append(ciudad);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
