package Un3Exemplos;

import java.util.Scanner;

public class UsaPonto {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Ponto[] vetPonto = new Ponto[2];
		
		preencher(vetPonto);
		imprimir(vetPonto);
		mover(vetPonto);
		imprimir(vetPonto);

	}

	public static void imprimir(Ponto[] vetPonto) {
		
		for(int i=0; i<vetPonto.length; i++) {
			System.out.println(vetPonto[i].toString());
		}
		
	}

	public static void mover(Ponto[] vetPonto) {
		double dx,dy;
		for(int i=0; i<vetPonto.length; i++) {
			System.out.println("mova x: ");
			dx = input.nextDouble();
			System.out.println("mova y: ");
			dy = input.nextDouble();
			vetPonto[i].mover(dx, dy);
		}
		
	}

	public static void preencher(Ponto[] vetPonto) {
		double x,y;
		for(int i=0; i<vetPonto.length; i++) {
			System.out.println("Entre com o ponto x: ");
			x = input.nextDouble();
			System.out.println("Entre com o ponto y: ");
			y = input.nextDouble();
			vetPonto[i] = new Ponto(x,y);
		}		
	}
	

}
