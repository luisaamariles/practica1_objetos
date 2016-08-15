
package punto19;

import java.util.Scanner;

public class punto19 {
    
    public static void main(String[] args) {
      int opcion;
      double rad;
      double alt;
      Scanner lector = new Scanner(System.in);
      Circulo circulo= new Circulo();
      Cilindro cilindro= new Cilindro();
      Cilindro_hueco cilindro_h= new Cilindro_hueco();
      do{
        System.out.println("Digite la opcion deseada:");
        System.out.println("1. Ingresar datos");
        System.out.println("0. Salir");
        opcion=lector.nextInt();
        
        switch(opcion){
            case 0: System.out.println("Hasta luego");
                break;
            case 1: circulo.Leer_radio();
                    circulo.Area();
                    circulo.Circunferencia();
                    rad=circulo.getRadio();
                    cilindro.Leer_altura();
                    cilindro.area_cilindro(rad);
                    cilindro_h.Leer_radio_I();
                    alt=cilindro.getAltura();
                    cilindro_h.area_cilindro_I(rad, alt);
                break;
            default: System.out.println("Opción invalida");
                break;
        }
        
        }while(opcion!=0);
    }
}
