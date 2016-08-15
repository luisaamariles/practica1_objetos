/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto16;

import java.util.Scanner;


public class Disco extends Publicacion {
    private double duracion;
    private Scanner lector = new Scanner(System.in);
    
    public void Asignar_datos(){
    Carga_Datos();
    System.out.println("Digite la duración del disco:");
    duracion=lector.nextDouble();
    }
    public void Data_Show_Dis(){
       Data_Show();
       System.out.println("Duración del disco:"+duracion+"\n");
     }
}
