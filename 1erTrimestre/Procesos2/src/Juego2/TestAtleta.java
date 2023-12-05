package Juego2;
import Juego2.Atleta;
public class TestAtleta {

	public static void main(String[] args) {
		
		Atleta atleta;
		for(int i=0; i<8;i++) {
			atleta = new Atleta(i+1,"gicho "+i,"pais "+i);
			new Thread(atleta).start();
		}
		
	}
}
