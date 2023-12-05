package contemos;

public class HiloINC extends Thread{

	private Contador contador;
	
	public HiloINC(String n, Contador c) {
		setName (n);
		contador = c;
	}
	
	public void run() {
		synchronized (contador) {
			
		
		for(int j=0;j<300;j++) {
			contador.incrementa();
			System.out.println(contador.toString());
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println(getName()+" Contador vale "+contador.getValor());
		}
		}
	}

