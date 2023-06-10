package Un3Exemplos;
import java.util.Random;
public class Dado {
	private int ValorFace;
	
	public Dado() {
		this.ValorFace = 1;
	}
	public void rolar() {
		Random inputRd = new Random();
		ValorFace = inputRd.nextInt(6)+1;
	}
	public int getValorFace() {
		return ValorFace;
	}

}
