package Un3Exemplos;
import java.util.Scanner;
public class UsaPessoa {

	public static void main(String[] args) {
		//criaar o vetor
		Pessoa[] vetPessoa = new Pessoa[2];
		Pessoa maisVelha, maisNova;
		
		cadastro(vetPessoa);
		maisVelha = pesqVelha(vetPessoa);
		maisNova = pesqNova(vetPessoa);
		imprimir(vetPessoa);
		System.out.println();
		System.out.println("Pessoa mais velha: "+ maisVelha.toString());
		System.out.println("Pessoa mais nova: "+ maisNova.toString());
	}
	
	private static void cadastro(Pessoa[] vetorPessoa) {
		Scanner input = new Scanner(System.in);
		String nome,cpf;
		int idade;
		Pessoa aux;
		
		for(int i=0; i<vetorPessoa.length; i++) {
			System.out.println("Nome: ");
			nome = input.next();
			System.out.println("CPF: ");
			cpf = input.next();
			System.out.println("Idade: ");
			idade = input.nextInt();
			//construindo a pessoa
			aux = new Pessoa(nome,cpf,idade);
			//colocando a Pessoa dentro do vetor, na posicao i
			vetorPessoa[i] = aux;
		}
	}
	private static Pessoa pesqVelha (Pessoa[] vetorPessoa) {
		int maior = vetorPessoa[0].getIdade();
		int pos = 0;
		
		for(int i=0; i<vetorPessoa.length; i++) {
			if (vetorPessoa[i].getIdade() > maior) {
				maior = vetorPessoa[i].getIdade();
				pos = i;
			}
		}
		return vetorPessoa[pos];
	}
	private static Pessoa pesqNova (Pessoa[] vetorPessoa) {
		int menor = vetorPessoa[0].getIdade();
		int pos = 0;
		
		for(int i=0; i<vetorPessoa.length; i++) {
			if (vetorPessoa[i].getIdade() < menor) {
				menor = vetorPessoa[i].getIdade();
				pos = i;
			}
		}
		return vetorPessoa[pos];
	}
	private static void imprimir(Pessoa[] vetorPessoa) {
		System.out.println("\nPessoas Cadastradas");
		for(int i=0; i<vetorPessoa.length; i++) {
			System.out.println(vetorPessoa[i].toString());			
		}
	}

}
