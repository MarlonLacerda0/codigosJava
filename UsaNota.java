package Un3Exemplos;

import java.util.Scanner;

public class UsaNota {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Nota[] vetor = new Nota[2];
		
		preencher(vetor);
		imprimir(vetor);

	}

	public static void imprimir(Nota[] vetor) {
		
		
	}

	public static void preencher(Nota[] vetor) {
		double nota1, nota2;
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Largura: ");
			nota1 = input.nextDouble();
			System.out.println("Altura: ");
			nota2 = input.nextDouble();
			vetor[i]= new Nota(nota1,nota2);
		}
	}

}
