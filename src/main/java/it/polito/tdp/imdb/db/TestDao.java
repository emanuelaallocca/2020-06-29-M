package it.polito.tdp.imdb.db;

import it.polito.tdp.imdb.model.Arco;
import it.polito.tdp.imdb.model.Director;

public class TestDao {

	public static void main(String[] args) {
		TestDao testDao = new TestDao();
		testDao.run();
	}
	
		public void run() {
        ImdbDAO dao = new ImdbDAO();
//	    System.out.println("Actors:");
//	    System.out.println(dao.listAllActors());
//		System.out.println("Movies:");
//	    System.out.println(dao.listAllMovies());
		System.out.println("Directors:");
		//System.out.println(dao.listAllArchi(2004));
		//for (Director d : dao.listAllDirectorsByYear(2004))
		//System.out.println(d);
		for (Arco d : dao.listAllArchi(2004))
				System.out.println(d);
		System.out.println(dao.listAllArchi(2005).size());
	}
	
	
}
