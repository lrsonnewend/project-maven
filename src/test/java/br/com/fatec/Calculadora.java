package br.com.fatec;

public class Calculadora {
	private int n1, n2;
	
	public Calculadora(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public Calculadora() {
		this(1,1);
	}

	public Integer soma () {
		return n1+n2;
	}

}
