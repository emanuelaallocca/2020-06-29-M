package it.polito.tdp.imdb.model;

public class Arco {

	private Director d;
	private Actor a;
	private int peso;
	
	
	public Arco(Director d, Actor a, int peso) {
		super();
		this.d = d;
		this.a = a;
		this.peso = peso;
	}


	public Director getD() {
		return d;
	}


	public void setD(Director d) {
		this.d = d;
	}


	public Actor getA() {
		return a;
	}


	public void setA(Actor a) {
		this.a = a;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "Arco [d=" + d + ", a=" + a + ", peso=" + peso + "]";
	}
	
	
	
}
