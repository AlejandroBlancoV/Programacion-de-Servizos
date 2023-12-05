package Parking;

import hotel.Hotel;

public class Coche extends Thread{
	private Parking parking;
	int t=0;
	
	
	public Coche(String numero, Parking p) {
		super(numero);
		this.parking=p;
		start();
		
	}
	
	public void run() {
		
			try {
				sleep((int) (Math.random()*10000));
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				parking.entra();
				
			} catch (Exception e) {
				// TODO: handle exception
			} 
			System.out.println(getName()+" : entra al parking");
			try {
				this.t=(int) (Math.random()*20000);
				sleep(t);
			} catch (Exception e) {
				// TODO: handle exception
			}
			parking.sale();
			System.out.println(getName()+" : sale del parking");
		
	}

	@Override
	public String toString() {
		return "Coche [Nombre=" + getName() + ", t=" + t + "]";
	}
	
	
	
}
