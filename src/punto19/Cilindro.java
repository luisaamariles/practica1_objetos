/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto19;

import java.util.Scanner;

/**
 *
 * @author Luisa Maria Amariles
 */
public class Cilindro extends Circulo {
    private double altura,a_cil,rad;

    public double getAltura() {
        return altura;
    }
    
     public void Leer_altura(){
        Scanner lector= new Scanner(System.in);
        System.out.println("Digite la altura del cilindro:");
        altura=lector.nextDouble(); 
    }
    
     public void area_cilindro(double radio){
         //rad=getRadio();
         a_cil=(2*Math.PI*radio*altura)+(2*Math.PI*Math.pow((radio),2));
         System.out.println("El área del cilindro es:"+a_cil);
     }
    
}
