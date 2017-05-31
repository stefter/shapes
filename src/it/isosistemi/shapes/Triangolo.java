package it.isosistemi.shapes;

public class Triangolo implements Forma {
	
	private int altezza;
	private int base;
	
	public Triangolo() {		
	}

	public Triangolo(int altezza, int base) {
		
		this.altezza = altezza;
		this.base = base;
	}

	@Override
	public int calcolaArea() {
		
		return (base*altezza)/2;
	}

	@Override
	public int calcolaPerimetro() {

		return 0;
	}

}
