/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto16;

import java.util.Scanner;

/**
 *
 * @author Luisa Maria Amariles
 */
public class Publicacion {
     private String titulo;
     private double precio;

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
          
     public void Carga_Datos(){
         Scanner lector= new Scanner(System.in);
         System.out.println("Ingrese el nombre de la publicación:");
         titulo=lector.next();
         System.out.println("Ingrese el precio de la publicación:");
         precio=lector.nextDouble();
     }
     public void Data_Show(){
        System.out.println("Titulo:"+titulo+"\n"+"Precio:"+precio);
     }
}
