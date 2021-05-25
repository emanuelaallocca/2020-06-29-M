package it.polito.tdp.imdb.model;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.imdb.db.ImdbDAO;
import java.util.*;

public class Model {
	

	private Graph <Director, DefaultWeightedEdge> grafo;
	private ImdbDAO dao;
	private Map <Integer, Director> idMap;
	
	
	public Model() {
		dao = new ImdbDAO();
		idMap = new HashMap <Integer, Director>();
	}
	
	public void creaGrafo(int year) {
		grafo = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
		
		List<Director> direttori = dao.listAllDirectorsByYear(year, idMap);
		
		Graphs.addAllVertices(grafo, idMap.values());
		
		Set <DefaultWeightedEdge> archi = this.grafo.edgeSet();
		
		List <Arco> arco = dao.listAllArchi(year);
		
		for (int i=0; i< arco.size(); i++) {
			for (int j=i+1; j<arco.size(); j++) {
				if (!arco.get(i).getD().getId().equals(arco.get(j).getD().getId()) && arco.get(i).getA().getId().equals(arco.get(j).getA().getId()))
				{
					DefaultWeightedEdge e = this.grafo.getEdge(idMap.get(arco.get(i).getD().getId()), idMap.get(arco.get(j).getD().getId()));
					
					if (this.grafo.containsEdge(e)){
						double t = this.grafo.getEdgeWeight(e);
							this.grafo.setEdgeWeight(e, t+1);
					}
					else
					{
						Graphs.addEdgeWithVertices(this.grafo, idMap.get(arco.get(i).getD().getId()), idMap.get(arco.get(j).getD().getId()), 1);
						
					}
						
						
						
				}
			}
		}
		

	}
	public Set<Director> getAllVertices(){
		return this.grafo.vertexSet();
	}
	public int getNVertici() {
		return this.grafo.vertexSet().size();
	}
	public int getNArchi() {
		return this.grafo.edgeSet().size();
	}
	

}
