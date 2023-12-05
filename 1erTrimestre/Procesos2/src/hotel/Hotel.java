package hotel;

import java.nio.file.spi.FileSystemProvider;

public class Hotel {

	private int places;
	
	public Hotel(int places) {
		if(places <0) {
			places=0;
		}
		this.places=places;
	}
	
	
	public synchronized void entra() {
		while(places==0) {
			try {
				System.out.println("Esperando, hotel COMPLETO");
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}	
		}
		places--;
	}
	
	public synchronized void sale() {
		System.out.println("Cliente SALE: Cama liberada");
		places ++;
		notifyAll();
	}
}
