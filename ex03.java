package listaa1c1;
import java.util.Scanner;
/*
 *  Autor: Marlon Lacerda de Oliveira
 * 	Data:  06/04/2023
 * 	EX03:  Avalicao1, C1 LPII 
 *	
 * */
public class ex03 {

	public static void main(String[] args) {
		double[] vetNotas = {10.0, 6.5, 8.0, 4.5, 5.0, 3.5, 5.6, 4.0, 5.9, 2.5};
		String[] vetNomes = {"ANDRE", "BRUNA", "CAROL", "DANIEL", "ELIAS", "FABIO", "GUSTAVO", "HADASSA", "INACIO", "JOAO"};	
		
		//chamando os metodos
		lerNome(vetNomes, vetNotas);
		System.out.println("----------------------");
		media(vetNomes, vetNotas); 
		System.out.println("----------------------");
		menorNota(vetNomes, vetNotas);		
	}
	
	//Metodo ler nome pedido pelo usuario
	public static void lerNome(String vNome[], double vNota[]) {
		Scanner input = new Scanner(System.in);
		String aux;
		System.out.println("Digite o nome do aluno:");		
		aux = input.next().toUpperCase();	
		
		for (int i = 0; i < vNome.length; i++) { 
            if (vNome[i].equals(aux)) {
                System.out.println("NOME: "+vNome[i] +"\nNOTA: "+vNota[i] );  
                break;
            } 
            else if(vNome[i] != aux && i == 9 ) {
                System.out.println(aux+", NOME NAO ENCONTRADO");                
            }
        }
	}
	
	//Metodo da media
	public static void media(String vNome[], double vNota[]) {
		for (int i = 0; i < vNota.length; i++) { 
			if (vNota[i] >= 6) {
				System.out.println("ALUNO: "+vNome[i] +" Esta acima da media ");				
	        } 
		}
		
	}
	//metodo menor nota
	public static void menorNota(String vNome[], double vNota[]) {
		double menor = 1000.0, maior = 0.0;
		String nome = null;
		for (int i = 0; i < vNota.length; i++) {
			if (vNota[i]<menor) {
				menor = vNota[i];
				nome = vNome[i];				
			}			
		}
		System.out.println(nome+" Tem a menor nota da turma: "+menor);
	}
}
