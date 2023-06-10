package listaa1c1;
import java.util.Random;
/*
 *  Autor: Marlon Lacerda de Oliveira
 * 	Data:  04/04/2023
 * 	EX02:  Avalicao1, C1 LPII 
 *	
 * */
public class ex02 {

	public static void main(String[] args) {
		double[] vet1 = new double[4];
		double[] vetQuadrado = new double[4];
		
		//chamada dos metodos
		preencheVetor(vet1);
		vetQuadrado = quadVetor(vet1);
		System.out.println("Vetor preenchido automaticamente:");
		imprimir(vet1);
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("Vetor com o quadrado de cada componente do vetor acima:");
		imprimir(vetQuadrado);

	}
	//metodos
	//preenche a matriz
	public static void preencheVetor(double[] vetor) {
		Random inputRd = new Random();
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = inputRd.nextDouble(20.0);
		}
	}
	//calculo do quadrado dos indices do vetor
	public static double[] quadVetor(double[] vetor) {
		double[] vetAux = new double[vetor.length];		
		for(int i=0; i<vetor.length; i++) {
			vetAux[i] = vetor[i] * vetor[i];
		}
		return vetAux;	
	}
	//imprimindo os vetores
	public static void imprimir (double[] vetor) {
		for(int i=0; i<vetor.length; i++) {
			System.out.print(vetor[i]+"  ");
		}
	}

}
