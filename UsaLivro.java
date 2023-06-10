package Un3Exemplos;

import java.util.Scanner;

public class UsaLivro {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Livro[] vetor = new Livro[2];
		
		preencher(vetor);
		imprimir(vetor);

	}	
	
	public static void preencher(Livro[] vetor) {
		String titulo, autor, editora;
		int ano;
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Titulo: ");
			titulo = input.next();
			System.out.println("Autor: ");
			autor = input.next();
			System.out.println("Editora: ");
			editora = input.next();
			System.out.println("Ano de publicacao: ");
			ano = input.nextInt();
			vetor[i] = new Livro(titulo, autor, editora,ano);
			
		}
		
	}
	
	public static void imprimir(Livro[] vetor) {
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i].getAno()>2010) {
				System.out.println(vetor[i].toString());
			}
		}
		
	}

}
