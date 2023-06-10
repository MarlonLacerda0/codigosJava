package Un3Exemplos;

public class Nota {
	private double nota1, nota2, media;

	public Nota(double nota1, double nota2, double media) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
	}

	public double media() {
		return this.nota1/this.nota2;
	}
	public String toString() {
		return "Nota [nota1=" + nota1 + ", nota2=" + nota2 + ", media=" + media + "]";
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
}
