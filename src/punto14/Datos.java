/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto14;

import java.util.Scanner;

/**
 *
 * @author Luisa Maria Amariles
 */
public class Datos {
    private double base, altura, radio, area;
    
    public void Circulo(){
        Scanner lector= new Scanner(System.in);
        System.out.println("Digite el radio:");
        radio=lector.nextDouble();
        area=Math.pow(radio, 2)*Math.PI; 
        System.out.println("El área del circulo es:"+area);
    }
    public void Triangulo(){
        Scanner lector= new Scanner(System.in);
        System.out.println("Digite la base:");
        base=lector.nextDouble();
        System.out.println("Digite la altura:");
        altura=lector.nextDouble();
        area=(base*altura)/2; 
        System.out.println("El área del triangulo es:"+area);
    }
    public void Cuadro(){
        Scanner lector= new Scanner(System.in);
        System.out.println("Digite el lado:");
        base=lector.nextDouble();
        area=Math.pow(base, 2); 
        System.out.println("El área del cuadro es:"+area);
    }
    public void Rectangulo(){
        Scanner lector= new Scanner(System.in);
        System.out.println("Digite la base:");
        base=lector.nextDouble();
        System.out.println("Digite la altura:");
        altura=lector.nextDouble();
        area=base*altura; 
        System.out.println("El área del rectangulo es:"+area);
    }
}
