package br.fiap.forma;

public abstract class Forma {
	protected int cx;
	protected int cy;
	protected double raio;
	
	public Forma(int cx, int cy, double raio) {
		super();
		this.cx = cx;
		this.cy = cy;
		this.raio = raio;
	}
	
	public abstract double calcularArea();
	
	@Override
	public String toString() {
		String aux = "";
		aux += "Coordenada x: " + cx + "\n";
		aux += "Coordenada y: " + cy + "\n";
		aux += "Raio: " + raio + "\n";
		return aux;
	}

	public int getCx() {
		return cx;
	}

	public void setCx(int cx) {
		this.cx = cx;
	}

	public int getCy() {
		return cy;
	}

	public void setCy(int cy) {
		this.cy = cy;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
		
}
