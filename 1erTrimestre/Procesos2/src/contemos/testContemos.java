package contemos;

public class testContemos {

	
	public static void main(String[] args) {
		Contador cont= new Contador(100);
		HiloINC a= new HiloINC("Hilo inc", cont);
		HiloDEC b = new HiloDEC("Hilo dec", cont);
		HiloINC c = new HiloINC("Hilo incrementa", cont);
		a.start();
		b.start();
		c.start();
	}
}
