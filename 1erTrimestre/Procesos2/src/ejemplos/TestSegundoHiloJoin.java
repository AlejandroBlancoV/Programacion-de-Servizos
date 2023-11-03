package ejemplos;

public class TestSegundoHiloJoin {
	
	public static void main(String[] args) {
		
		SegundoHilo windows=null;
		System.out.println("antes de arrancar el hilo.......");
		
		for(int i=0;i<20;i++) {
			windows= new SegundoHilo(i);
			windows.start();
			
			try {
				windows.join();// obliga al hilo que lo llama a terminar antes que el hilo desde el que se lanza.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("han rematado todos los sugos sugos joineados");
		System.out.println("el main ha terminado");
	}
}
