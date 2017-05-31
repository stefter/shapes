package it.isosistemi.shapes;


/**
 * @author Corsi
 * @version 1.0
 * @created 30-mag-2017 16.14.56
 */
public class Rettangolo implements Forma {

	private int altezza;
	private int larghezza;

	public Rettangolo(){
		
	}
	
	public Rettangolo(int a, int l){
		this.altezza = a;
		this.larghezza = l;
	}

	public void finalize() throws Throwable {

	}

	public int calcolaArea(){
		return this.altezza*this.larghezza;
	}

	public int calcolaPerimetro(){
		return 0;
	}
	
	

}