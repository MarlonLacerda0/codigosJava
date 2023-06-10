package Un3Exemplos;

public class UsaDado {

	public static void main(String[] args) {
		Dado dado = new Dado();
		int total = 0;
		
		for(int i=0; i<4; i++) {
			dado.rolar();
			System.out.println("Valor do dado= "+dado.getValorFace());
			total += dado.getValorFace();
		}
		System.out.println("Total= "+total);

	}

}
