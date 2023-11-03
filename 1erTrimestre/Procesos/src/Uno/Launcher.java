package Uno;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Launcher {
	static final int NUM_PROCESOS=4;
	static final String PREFIJO_FICHEROS="fich";
	
	public static void lanzarSumador(
			int n1, int n2,String fichResultados) throws IOException{
			String comando;
			comando="Sumador.java";

			File directorioSumador;
			directorioSumador=new File("C:\\Users\\Cebem\\Desktop\\Eclipse\\Repaso\\src\\Ejemplo4\\Sumador.java");
			File fichResultado=new File(fichResultados);
			
			ProcessBuilder pb;
			pb=new ProcessBuilder("java", comando, String.valueOf(n1), String.valueOf(n2));
			pb.directory(directorioSumador);
			pb.redirectOutput(fichResultado);
			pb.start();
			}
	public static int getResultadoFichero(
			
	String nombreFichero){
		
		int suma=0;
		
		try {
			
		FileInputStream fichero=
		new FileInputStream(nombreFichero);
		InputStreamReader fir=
		new InputStreamReader(fichero);
		BufferedReader br=new BufferedReader(fir);
		
		//Solo lee una línea
		String linea=br.readLine();
		suma= new Integer(linea);
		return suma;
		
		} 
		
		catch (FileNotFoundException e) {
		System.out.println("No se pudo abrir "+nombreFichero);
		} 
		
		catch (IOException e) {
		System.out.println("No hay nada en "+nombreFichero);
		}
		return suma;
		}
}
