package Un3Exemplos;

public class Retangulo {
	private double largura , altura;

	public Retangulo(double largura, double altura) {
		
		this.largura = largura;
		this.altura = altura;
	}
	public double perimetro() {		
		double perimetro;
		return perimetro = (2*largura)+(2*altura);
	}

	public double area() {	
		double area;
		return area = largura*altura;
	}
	public String toString() {
		return "Retangulo [largura=" + largura + ", altura=" + altura + "]";
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
			
}
