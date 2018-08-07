package br.unicentro.acaddecomp;

public class Cliente {
	public static void main(String args[]){
		Triangulo t1 = new Triangulo(10, 20);
		PrototipoTriangulo t2;
		t2 = t1.clonar();
		System.out.println(t1);
		System.out.println(t2);
	}
}
