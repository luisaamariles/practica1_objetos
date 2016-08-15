/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto18;

import java.util.Scanner;

/**
 *
 * @author Luisa Maria Amariles
 */
public class Nombre {
   private String nombre,primer_ap,segundo_ap;
   
   public void Leer_nombre(){
       Scanner lector= new Scanner(System.in);
        System.out.println("Ingrese el nombre:");
        nombre=lector.next();
        System.out.println("Ingrese el primer apellido:");
        primer_ap=lector.next();
        System.out.println("Ingrese el segundo apellido:");
        segundo_ap=lector.next();       
   }
   
   public void Mostrar_nombre(){
       System.out.println("Nombre:"+nombre+" "+primer_ap+" "+segundo_ap);
   }
}
