
package punto17;

import java.util.Scanner;

/**
 *
 * @author Luisa Maria Amariles
 */
public class punto17 {
    public static void main(String[] args) {
        int opcion;
        Scanner lector = new Scanner(System.in);
        Libro libro = new Libro();
        Disco disco = new Disco();
        do{
        System.out.println("Digite la opcion deseada:");
        System.out.println("1. Libro");
        System.out.println("2. Disco");
        System.out.println("3. Mostrar historial de ventas");
        System.out.println("0. Salir");
        opcion=lector.nextInt();
        
        switch(opcion){
            case 0: System.out.println("Hasta luego");
                break;
            case 1: libro.Asignar_datos();
                    libro.Data_Show_lib();
                break;
            case 2: disco.Asignar_datos();
                    disco.Data_Show_Dis();
                break;
            default: System.out.println("Opcion invalida");   
                break;
        }
    }while(opcion != 0);
 
}

}
