package Juego2;

import java.util.Random;

public class Atleta implements Runnable, Comparable<Atleta>{

	int dorsal;
	String nombre;
	long tiempo;
	String pais;
	
	
	
	
	
	public Atleta(int dorsal, String nombre,  String pais) {
		super();
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.pais = pais;
	}







	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.nombre+" preparado");
		long inicio=System.currentTimeMillis();
		Random r= new Random();
		tiempo= r.nextLong(8000,12000);
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.nombre + "llegando");
		long fin = inicio + tiempo;
		this.tiempo=fin;
		System.out.println(toString());
	}




	@Override
	public String toString() {
		return "Atleta [dorsal=" + dorsal + ", nombre=" + nombre + ", tiempo=" + tiempo + ", pais=" + pais + "]";
	}







	@Override
	public int compareTo(Atleta o) {
		Atleta a= (Atleta) o;
		return (int)(this.tiempo -a.tiempo);
	}

	
	
	
	
}
