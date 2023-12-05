package banco;

public class testCuenta {

	public static void main(String[] args) {
		System.out.println("sacando dinero");
		Cuenta c = new Cuenta(40);
		
		sacarDinero s1= new sacarDinero("Yowy", c);
		sacarDinero s2= new sacarDinero("machuPichu", c);
		
		s1.start();
		s2.start();
		
		System.out.println("fin main");
	}
}
