package AmbienteDevSoftware;
import java.util.Arrays;
import java.util.Random;

public class Quicksort {
	
	public void quicksort (int[] A) {
		quicksort(A, 0, A.length-1);
	}
	
	private void quicksort(int[] A, int menor, int maior) {
		if (menor < maior + 1) {
			int p = particao(A, menor, maior);
		}
	}
	
	private void troca(int[] A, int index1, int index2) {
		int temp = A[index1];
		A[index1] = A[index2];
		A[index2] = temp;
	}
	
	//Define um pivor aleatorio entre os numeros do vetor
	private int getPivor(int menor, int maior) {
		Random rand = new Random ();
		return rand.nextInt((maior - menor) + 1) + menor;
	}
	
	//Move todo conteudo dividindo entre numeros menores e numeros maiores
	private int particao(int[] A, int menor, int maior) {
		troca(A, menor, getPivor(menor, maior));
		int border = menor + 1;
		
		for (int i = border; i <= maior; i++) {
			if (A[i] < A[menor]) {
				troca(A, i, border++);
				
			}
		}
		troca (A, menor, border-1);
		return border-1;
		
	}
	
	public static void main (String[] args) {
		Quicksort qs = new Quicksort();
		int[] A = {9, 0, 1, 3, 4, 5, 2, 9, 8, 7, 6, 5, 9, 1, 0, 9};
		
		System.out.println(Arrays.toString(A));
		qs.quicksort(A);
		System.out.println(Arrays.toString(A));
		
	}
	
}