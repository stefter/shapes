package it.isosistemi.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Corsi
 * @version 1.0
 * @created 30-mag-2017 16.14.12
 */
public class Canvas {

	private List<Forma> forme;
	
	public Canvas(){
		forme = new ArrayList<>();
	}

	public void finalize() throws Throwable {

	}

	public int calcolaAreaTotale(){
		int areaTotale = 0;
		for(Forma f: forme){
			areaTotale += f.calcolaArea();
		}
		
		
//		intSummaryStatistics areaTotalejava8 = rettangoli.stream()
//				.collect(Collectors.summarizingInt(Rettangolo::calcolaArea));	
		return areaTotale;
	};

	public int calcolaPerimetroTotale(){
		return 0;
	}

	public void add(Forma f) {		
		forme.add(f);
	};
			
	/**
	 * Restituisce il numero di forme contenute dal canvas 
	 * @return
	 */
    public int size() {
		
		return forme.size();
	};
	

}