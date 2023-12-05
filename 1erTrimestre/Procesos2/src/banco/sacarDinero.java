package banco;

public class sacarDinero extends Thread{
	
	private Cuenta c;
	
	String nom;
	
	public sacarDinero(String n, Cuenta c) {
		super(n);
		this.c= c;
	}
	public void run() {
		for(int i=0;i<=4;i++) {
			c.retirarDinero(10, this.getName());
		}
	}

}
