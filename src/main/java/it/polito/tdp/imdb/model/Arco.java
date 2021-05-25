package it.polito.tdp.imdb.model;

public class Arco {

	private Director d;
	private Actor a;
	private int movie_id;
	
	public Arco(Director d, Actor a, int movie_id) {
		this.d = d;
		this.a = a;
		this.movie_id = movie_id;
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
		return movie_id;
	}


	public void setPeso(int peso) {
		this.movie_id = peso;
	}


	@Override
	public String toString() {
		return "Arco [d=" + d + ", a=" + a + ", peso=" + movie_id + "]";
	}
	
	
	
}
