
package punto19;

import java.util.Scanner;

/**
 *
 * @author Luisa Maria Amariles
 */
public class Cilindro_hueco extends Circulo {
    double rad_I,a_cil_i;
    public void Leer_radio_I(){
        Scanner lector= new Scanner(System.in);
        System.out.println("Digite el radio interno:");
        rad_I=lector.nextDouble(); 
    }
    
     public void area_cilindro_I(double radio, double altura){
         a_cil_i=(2*Math.PI*((Math.pow(radio, 2))-(Math.pow(rad_I,2))))+(2*Math.PI*altura*radio)+(2*Math.PI*altura*rad_I);
         System.out.println("El área del cilindro hueco es:"+a_cil_i);
     }
}
