package listaa1c1;
import java.util.Scanner;
import java.util.Random;
/*
 *  Autor: Marlon Lacerda de Oliveira
 * 	Data:  03/04/2023
 * 	EX01:  Avalicao1, C1 LPII 
 *	
 * */
public class ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		int lin, col,linUsuario,media;		
		
		//Entrada da dimensao da matriz
		System.out.println("Digite o numero de linhas da matriz: ");
		lin = input.nextInt();
		System.out.println("Digite o numero de colunas da matriz: ");
		col = input.nextInt();		
		int[][] mat = new int[lin][col];
		
		//chamada dos metodos
		preencheMatriz(mat);
		linUsuario = lerLinha();
		media = calcMedia(linUsuario, mat);
		imprimirMatriz(mat);
		System.out.println("Media da linha "+linUsuario+": "+media);
		
	}
	//metodos	
	//preenche matriz
	public static void preencheMatriz(int[][] matriz) {
		Random inputRd = new Random();
		for(int lin=0; lin<matriz.length; lin++) {
			for(int col=0; col<matriz[lin].length; col++) {
				matriz[lin][col] = inputRd.nextInt(10);
			}				
		}
	}
	//inteiro que indica uma das linhas da matriz 
	public static int lerLinha () {
		Scanner input = new Scanner(System.in);
		int lin;
		System.out.println("Escolha uma linha da sua matriz:");
		lin = input.nextInt();
		return lin;
	}
	//calculo da media
	public static int calcMedia(int linha, int[][]matriz) {
		int cont=0, soma=0, media=0;
		if(linha >=1 && linha <=4) {
			for(int col=0; col<matriz[linha-1].length; col++) {
				soma += matriz[linha-1][col];
				cont+=1;			
			}		
			media = soma / cont;
		}
		else if(linha == 5) {
			for(int col=0; col<matriz[4].length; col++) {
				soma += matriz[4][col];
				cont+=1;			
			}		
			media = soma / cont;
		}
		return media;
	}
	//imprimir matriz
	public static void imprimirMatriz(int[][]matriz) {
		System.out.println("Matriz:");
		for(int lin=0; lin<matriz.length; lin++) {
			for (int col=0; col<matriz[lin].length; col++) {
				System.out.print(matriz[lin][col]+"  ");
			}
			System.out.println();
		}	
	}

}
