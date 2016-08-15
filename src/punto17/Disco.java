
package punto17;

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
