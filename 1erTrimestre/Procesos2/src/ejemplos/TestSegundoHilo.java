package ejemplos;

public class TestSegundoHilo {

	public static void main(String[] args) {
		SegundoHilo windows=null;
		System.out.println("antes de arrancar el hilo.......");
		for(int i=0;i<20;i++) {
			windows= new SegundoHilo(i);
			windows.start();
		}
		System.out.println("el main ha terminado");
	}
}
