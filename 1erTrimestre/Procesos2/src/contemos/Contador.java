package contemos;

public class Contador {

	
	private int c=0;
	
	
	public Contador(int c) {
		this.c=c;
	}
	
	public void incrementa() {
		c++;
	}
	public void decrementa() {
		c--;
	}
	public int getValor() {
		return c;
	}

	@Override
	public String toString() {
		return "Contador [c=" + c + "]";
	}
	
	
}
