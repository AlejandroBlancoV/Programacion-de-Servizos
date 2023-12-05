package hotel;

class Cliente extends Thread{
	private Hotel hotel;
	
	public Cliente(String numero, Hotel p) {
		super(numero);
		this.hotel=p;
		start();
		
	}
	
	public void run() {
		
			try {
				sleep((int) (Math.random()*10000));
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
			hotel.entra();
			System.out.println(getName()+" : entra al hotel");
			try {
				sleep((int) (Math.random()*20000));
			} catch (Exception e) {
				// TODO: handle exception
			}
			hotel.sale();
			System.out.println(getName()+" : sale del hotel");
		
	}
}
