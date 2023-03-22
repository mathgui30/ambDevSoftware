import java.util.Scanner;

public class contador {
	public static void main (String[] args) {
		Scanner v = new Scanner(System.in);
		System.out.println("Qual o valor máximo");
		int n = v.nextInt();
		int res = 0;
		for (int i = 0;i<n;i++) {
			System.out.println("Insira os valores");
			int val = v.nextInt();
			if(val % 1 == 0) {
				res += 1;
			}
			System.out.println("Há " + res + " valores inteiros");
		}
	}
}