

package punto14;
import java.util.Scanner;

public class punto14 {
 
    public static void main(String[] args) {
        int opcion;
        Scanner lector = new Scanner(System.in);
        Datos datos = new Datos();
        
        do{
          System.out.println("Ingrese la figura con la cual desea realizar los calculos:");
          System.out.println("1. Circulo ");
          System.out.println("2. Triangulo ");
          System.out.println("3. Cuadrado ");
          System.out.println("4. Rectangulo ");
          System.out.println("0. Salir");
          opcion=lector.nextInt(); 
          
          switch(opcion){
              case 0: System.out.println("Hasta luego");
                  break;
              case 1: datos.Circulo();
                  break;
              case 2: datos.Triangulo();
                  break;
              case 3: datos.Cuadro();
                  break;
              case 4: datos.Rectangulo();
                  break;            
              default: System.out.println("Opcion invalida");
                break;
          }
        }while(opcion!=0);
    }
}
