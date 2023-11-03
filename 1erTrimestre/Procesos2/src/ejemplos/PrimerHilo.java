package ejemplos;

public class PrimerHilo extends Thread{

	int x;
	public PrimerHilo(int x) {
		// TODO Auto-generated constructor stub
		System.out.println("Estoy creando un hilo gabripazos13@gmail.com");
		this.x=x;
		
	}
	
	public void run(){
		for(int i=0;i<x;i++) {
			System.out.println("Sugo Sugo "+i);
		}
	}
	
}
