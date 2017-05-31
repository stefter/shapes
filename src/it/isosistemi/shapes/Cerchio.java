package it.isosistemi.shapes;


/**
 * @author Corsi
 * @version 1.0
 * @created 30-mag-2017 16.15.06
 */
public class Cerchio implements Forma {

	private int raggio;

	public Cerchio(){

	}

	public Cerchio(int radius) {
		this.raggio = radius;
	}

	public void finalize() throws Throwable {

	}

	public int calcolaArea(){
		return raggio*raggio*3;
	}

	public int calcolaPerimetro(){
		return 0;
	}

}