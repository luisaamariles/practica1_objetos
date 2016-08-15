
package punto19;

import java.util.Scanner;

public class Circulo {
  private double radio,area,circunferencia;

  public double getRadio() {
        return radio;
  }

  public void setRadio(double radio) {
        this.radio = radio;
  }
 
  public void Leer_radio(){
        Scanner lector= new Scanner(System.in);
        System.out.println("Digite el radio:");
        radio=lector.nextDouble(); 
  }
  
  public void Area(){
     area=Math.pow(radio,2)*Math.PI;
     System.out.println("el área del circulo es:"+area);
  }
  
  public void Circunferencia(){
      circunferencia=2*Math.PI*radio;
      System.out.println("La longitud del circulo es:"+circunferencia);
  }
}
