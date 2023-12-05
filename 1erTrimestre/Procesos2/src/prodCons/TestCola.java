package prodCons;

public class TestCola {

	
	
	public static void main(String[] args) {
		Cola miPrimeraCola= new Cola();
		Productor p= new Productor(miPrimeraCola,11);
		Consumidor c= new Consumidor(miPrimeraCola, -55);
		
		p.start();
		c.start();
	}
}
