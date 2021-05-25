package it.polito.tdp.imdb.model;

import java.util.Comparator;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultWeightedEdge;

public class Comparatore implements Comparator<Director>{
	
	private Graph <Director, DefaultWeightedEdge> grafo;
	private Director d;
	
	public Comparatore(Graph<Director, DefaultWeightedEdge> grafo, Director d) {
		super();
		this.grafo = grafo;
		this.d = d;
	}

	@Override
	public int compare(Director d1, Director d2) {
		// TODO Auto-generated method stub
		DefaultWeightedEdge e = this.grafo.getEdge(d, d1);
		DefaultWeightedEdge ef = this.grafo.getEdge(d,d2);
		return -(int)(this.grafo.getEdgeWeight(e)-this.grafo.getEdgeWeight(ef));
	}
	
	

}
