package Juego1;

public class Tirada extends Thread implements Comparable<Tirada>{

	String nombre;
	int puntos;
	
	Tirada(String n){
		this.nombre=n;
	}
	
	public void run() {
		Dado sindar;
		//int marcador=0;
		for(int i=0;i<2;i++) {
			sindar= new Dado();
			sindar.start();
			//System.out.println(this.getNombre() +sindar.toString());
			puntos+=sindar.getRes();
					
		}
		System.out.println(this.toString());
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Tirada [nombre=" + nombre + ", puntos=" + puntos + "]";
	}
	
	
	@Override
	public int compareTo(Tirada o) {
		// TODO Auto-generated method stub
		
		Tirada t= (Tirada) o;
		
		
		
		return -(this.puntos-o.puntos);
	}
	
	}
	

