package ejemplos;

public class TesteoPrimerHilo {

	public static void main(String[] args) {
		PrimerHilo gaalpos= new PrimerHilo(40);
		System.out.println("antes de arrancar el hilo.......");
		
		PrimerHilo gaalpos2= new PrimerHilo(40);
		gaalpos.start();
		gaalpos2.start();
		System.out.println("el main ha terminado");
	}
	
	
}
