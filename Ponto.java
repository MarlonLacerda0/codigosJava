package Un3Exemplos;

public class Ponto {
	private double x,y;
	

	public Ponto(double x, double y) {
		
		this.x = x;
		this.y = y;
	}

	public void mover(double dx,double dy) {
		this.x+=dx;
		this.y+=dy;
	}
	public String toString() {
		return ("("+this.x+")"+"("+this.y+")");
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
}
