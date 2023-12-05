package Juego2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Carrera {

	
	ArrayList<Atleta> finalistas= new ArrayList<Atleta>();
	
	Carrera(){
		
	}
	Carrera(ArrayList<Atleta> f){
		this.finalistas=f;
	}
	
	public int numeroParticipantes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca numero de participantes: ");
		int n= sc.nextInt();
		return n;
	}
	
	public void inicializaCarrera() {
		int n= numeroParticipantes();
		
		
		for(int i=0; i<n;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Datos del atleta: "+i);
			
			System.out.println("Introduzca nombre: ");
			String nombre =sc.nextLine();
			
			System.out.println("Introduzca pais: ");
			String pais =sc.nextLine();
			
			System.out.println("Introduzca dorsal: ");
			int dorsal =sc.nextInt();
			
			
			Atleta atleta= new Atleta(dorsal, nombre, pais);
			finalistas.add(atleta);
			
		}
		System.out.println("preparados......");
		//sc.close();
	}
	
	public void correr() {
		System.out.println("listos......");
		Thread t= null;
		for(Atleta atleta: finalistas) {
			t= new Thread(atleta);
			t.start();
			}
	System.out.println("PUM..................");
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	
	public void mostrarClasificacion(){
		Collections.sort(finalistas);
		System.out.println("Clasificación");
		for(Atleta atletas: finalistas) {
			System.out.println(atletas.toString());
		}
	}
	
}
