package AmbienteDevSoftware;
import java.util.Scanner;

public class MDC{
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		int a = entrada.nextInt();
		
		System.out.println("Digite o segundo numero");
		int b = entrada.nextInt();
		
		int maior, mdc = 1;
		
		if (a > b) {
			maior = a;

		} else {
			maior = b;
		}
		
		for (int i = 2; i <= maior; ++i) {
			while((a % i == 0) && (b % i == 0)) {
				a /= i;
				b /= i;
				mdc *= i;
			}
		}
		System.out.println(mdc);
	}
}