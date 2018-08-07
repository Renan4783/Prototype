package br.unicentro.acaddecomp;

public class Triangulo implements PrototipoTriangulo{

	private double altura;
	private double largura;
	
	public Triangulo(double altura, double largura){
		this.altura = altura;
		this.largura = largura;
	}
	
	@Override
	public Triangulo clonar() {
		//copia rasa
		return new Triangulo (altura, largura);
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(Double largura){
		this.largura = largura;
	}
	
	public double getAltura() {
		return altura;
	}	

	public void setAltura(Double altura){
		this.altura = altura;
	}
	
	public String toString(){
		return ("Altura: " + getAltura() + " Largura: " + getLargura());
	}
}
