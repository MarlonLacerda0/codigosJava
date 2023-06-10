package Un3Exemplos;

import java.util.Scanner;

public class UsaRetangulo {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Retangulo[] vetor = new Retangulo[2];
		
		preencher(vetor);		
		imprimir(vetor);

	}

	public static void preencher(Retangulo[] vetor) {
		double largura,altura;
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Largura: ");
			largura = input.nextDouble();
			System.out.println("Altura: ");
			altura = input.nextDouble();
			vetor[i]= new Retangulo(largura,altura);
		}
		
	}

	private static void imprimir(Retangulo[] vetor) {
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Vetor: "+vetor[i].toString());
			System.out.println("Area: "+vetor[i].area());
			System.out.println("Perimetro: "+vetor[i].perimetro());
		}
		
	}

}
