package prodCons;

public class Cola {

	private int numero;
	private boolean disponible = false;
	// inicialmente cola vacia

	public synchronized int get() {
		while(disponible==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			disponible= false;
			notifyAll();
			return numero;
		
	}

	public synchronized void put(int valor) {
	     while(disponible==true) {
	    	 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
	    
	     numero= valor;
	     disponible=true;
	     notifyAll();
	     
	}

	@Override
	public String toString() {
		return "Cola [numero=" + numero + ", disponible=" + disponible + "]";
	}
	
}