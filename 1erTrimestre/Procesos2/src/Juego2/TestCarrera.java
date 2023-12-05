package Juego2;

public class TestCarrera {

	
	public static void main(String[] args) {
		
		Carrera japon= new Carrera();
		japon.inicializaCarrera();
		japon.correr();
		japon.mostrarClasificacion();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		japon.mostrarClasificacion();
		System.out.println("acabo la prueba");
	}
}
