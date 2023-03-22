package AmbienteDevSoftware;

import java.util.Scanner;
public class Primo {
  public static void main(String[] args) {
  Scanner data = new Scanner(System.in);
    System.out.println("Digite um numero para verificar se eh primo");
    int primo = data.nextInt();
    int div = 0;
    
    for(int i = 1; i <= primo; i++) {
      if (primo % i == 0) {
        div++;
      }
    }

    if (div == 2 ){
      System.out.println("Eh primo");
    } else {
      System.out.println("N eh primo");
    }
  }
}