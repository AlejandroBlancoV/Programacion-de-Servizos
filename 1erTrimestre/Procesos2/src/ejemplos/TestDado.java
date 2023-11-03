package ejemplos;

public class TestDado {

	public static void main(String[] args) {
		Dado sindar;
		int marcador=0;
		for(int i=0;i<2;i++) {
			sindar= new Dado();
			sindar.start();
			//System.out.println(sindar.toString());
			marcador+=sindar.getRes();
					
		}
		System.out.println("MARCADOR: "+marcador);
		
	}
}
