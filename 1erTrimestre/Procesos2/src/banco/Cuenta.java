package banco;

public class Cuenta {

	private int saldo;
	
	Cuenta(int s){
		saldo=s;
		
	}
	
	int getSaldo() {
		return saldo;
		}
	
	void restar(int cantidad) {
		saldo=saldo-cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + "]";
	}
	
	synchronized void retirarDinero(int cant, String nom) {
		if(getSaldo()>=cant) {
			System.out.println("SE VA A RETIRAR SALDO (EL ACTUAL ES : "+getSaldo()+" )");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			restar(cant);
			
			System.out.println(nom+" retira => "+cant+" ACTUAL ( "+getSaldo()+")");
			
		}
		else {
			System.out.println(nom+" No se puede retirar dinero, NO HAY SALDO( "+getSaldo()+")");
			
		}
		
		if(getSaldo()<0) {
			System.out.println("SALDO NEGATIVO => "+getSaldo());
		}
	}
	
}
