
package punto16;

import java.util.Scanner;

public class Libro extends Publicacion{
    private double N_pag,año;
    private Scanner lector = new Scanner(System.in);
    Publicacion publ = new Publicacion();
    
    public void Asignar_datos(){
    Carga_Datos();
    System.out.println("Digite el número de paginas:");
    N_pag=lector.nextDouble();
    System.out.println("Digite el año de publicación:");
    año=lector.nextDouble();
    }
    public void Data_Show_lib(){
       Data_Show();
       System.out.println("Número de paginas:"+N_pag+"\n"+"Año de publicación:"+año);
     }
}
