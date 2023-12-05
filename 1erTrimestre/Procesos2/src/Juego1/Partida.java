package Juego1;

import java.util.Collections;
import java.util.List;

public class Partida {

	List<Tirada> jugadores;
	
	Partida(List<Tirada> j ){
		this.jugadores=j;
	}
	
	
	//metodo para inicializar
	
	//metodo para ordenar los jugadores 
	public void resultadoPuntos() {
		Collections.sort(jugadores);
	}
	
	
	public List<Tirada> getJugadores() {
		return jugadores;
	}


	public void setJugadores(List<Tirada> jugadores) {
		this.jugadores = jugadores;
	}


	public void verMarcador() {
		resultadoPuntos();
		System.out.println("\nMARCADOR FINAL");
		for(Tirada tirada: jugadores) {
			System.out.println(tirada.toString());
		}
	}
}
