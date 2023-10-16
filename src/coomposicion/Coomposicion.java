/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coomposicion;

import coomposicion.Cliente;
import coomposicion.Fechanacimiento;
import coomposicion.Direccion;
import javax.swing.JOptionPane;


public class Coomposicion {

   
    public static void main(String[] args) {
        // TODO code application logic here
        

        Direccion d=new Direccion(JOptionPane.showInputDialog("Ingrese la calle"),
                JOptionPane.showInputDialog("Ingrese la direccion externa"),
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese CP")),
                JOptionPane.showInputDialog("Ingrese la ciudad"));
        
        Fechanacimiento f =new Fechanacimiento(Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia de nacimiento")),
                Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes de nacimiento")),
               Integer.parseInt(JOptionPane.showInputDialog("Ingresar año de nacimiento"))
        );
        
     
        Cliente cliente1=new Cliente(JOptionPane.showInputDialog("Ingresar nombre"), JOptionPane.showInputDialog("Ingresar apellido paterno"), JOptionPane.showInputDialog("Ingresar apellido materno"), f, d);
        
        System.out.println("cliente1 = " + cliente1);

    }
    
}
