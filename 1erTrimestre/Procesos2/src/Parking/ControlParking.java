package Parking;

import java.util.ArrayList;

public class ControlParking {

	public static void main(String[] args) {
		ArrayList<Coche> automoto= new ArrayList<Coche>();
		
		Parking p= new Parking(10);
		
		for(int i=0;i<=50;i++) {
			Coche c= new Coche("Coche numero: "+i,p);
			automoto.add(c);
		}
		
		for(Coche co: automoto) {
			try {
				co.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(Coche c: automoto)
			System.out.println(c);
		
		
	}

	
}
