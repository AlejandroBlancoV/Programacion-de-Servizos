package Parking;

public class Parking {
private int plazas;
	
	public Parking(int sitios) {
		if(sitios <0) {
			sitios=0;
		}
		this.plazas=sitios;
	}
	
	
	public synchronized void entra() {
		while(plazas==0) {
			try {
				System.out.println("Esperando, parking COMPLETO");
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}	
		}
		plazas--;
	}
	
	public synchronized void sale() {
		System.out.println("Coche SALE: Plaza liberada");
		plazas ++;
		notifyAll();
	}
}
