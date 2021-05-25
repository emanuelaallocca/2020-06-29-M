package it.polito.tdp.imdb.model;
import java.util.*;

public class TestModel {

public static void main(String[] args) {
		
		Model model = new Model();
		model.creaGrafo(2006);
		
		System.out.println(model.getNVertici());
		System.out.println(model.getNArchi());
		

	}
}
