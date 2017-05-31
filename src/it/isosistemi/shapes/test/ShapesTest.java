package it.isosistemi.shapes.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import it.isosistemi.shapes.Canvas;
import it.isosistemi.shapes.Cerchio;
import it.isosistemi.shapes.Quadrato;
import it.isosistemi.shapes.Rettangolo;
import it.isosistemi.shapes.Triangolo;

public class ShapesTest {

	private Canvas c;
	private Rettangolo r;
	private Cerchio ce;
	private Quadrato q;
	
	@Before
	public void setup(){
		int height = 4;
		int width = 5;
		int radius = 3;
		int lato = 4;
		
		c = new Canvas();
		r = new Rettangolo(height, width);		
		ce = new Cerchio(radius);		
		q = new Quadrato(lato);	
		
	}
	
	@Test
	public void shouldAddShapeToCanvans() {
		
		
		//voglio aggiungere la forma al canvas
		c.add(r);
		
		//verifico che il canvas contiene 1 forma
		assertEquals("il canvas ha una forma", 1, c.size());				
	}
	
	@Test
	public void shouldAddAllShapeToCanvans() {
		
		//voglio aggiungere le forma al canvas
		c.add(r);
		c.add(ce);
		c.add(q);
		
		//verifico che il canvas contienga tutte le 3 forme
		assertEquals("il canvas ha una forma", 3, c.size());				
	}
	
	@Test
	public void shouldCalculateAreaOnShape(){
		

		int area = r.calcolaArea();
		assertTrue("L'area non è ", area > 0 );
		
		int areaCerchio = ce.calcolaArea();
		assertTrue("L'area non è ", areaCerchio > 0 );
		
		int areaQuadrato = q.calcolaArea();
		assertTrue("L'area non è ", areaQuadrato > 0 );
		
	}
	
	@Test
	public void shouldCalculateCanvasArea(){
		
		
		c.add(ce);
		c.add(q);
		c.add(r);
		int areaTotale = c.calcolaAreaTotale();			
		assertTrue("il canvas ha area totale coretta", areaTotale >0);		
		assertEquals("L'aerea totale è pare a 63", 63 ,areaTotale);
	}
	

	@Test
	public void shouldCalcualteTriangles(){
		c.add(r);
		c.add(ce);
		c.add(q);
		Triangolo t = new Triangolo(2,2);
		c.add(t);
		
		int areaTotale = c.calcolaAreaTotale();
		assertEquals("L'aerea totale è pare a 65", 65 ,areaTotale);
	}
}
