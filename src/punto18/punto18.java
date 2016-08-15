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
public class punto18 {
    public static void main(String[] args) {
          
    int opcion;
    Scanner lector = new Scanner(System.in);
    do{
        System.out.println("Digite la opcion deseada:");
        System.out.println("1. Ingresar datos");
        System.out.println("0. Salir");
        opcion=lector.nextInt();
        
        switch(opcion){
             case 0: System.out.println("Hasta luego");
                break;
            case 1: 
                break;
            default: System.out.println("Opción invalida");
                break;  
        }
    }while(opcion!=0);
    }
}
