package ContarConsonantes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Launcher {
	public static int getResultadoFichero(String nombreFichero){
				
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
/*1. Recoger el primer parámetro (args[0]), que contendrá el fichero a
procesar.
2. Recoger el segundo parámetro, que contendrá el directorio de
“CLASSPATH” donde habrá que buscar la clase “UtilidadesFicheros”.
3. Recoger el tercer parámetro, que contendrá el directorio donde habrá
que buscar la clase “ProcesadorFicheros”.
4. Una vez recogidos los parámetros, se lanzarán los procesos utilizando
la clase “ProcessBuilder”.
5. Los procesos se ejecutarán y después recogeremos los resultados de
los ficheros.*/
	
	public static void main(String[] args)throws IOException, InterruptedException {
		//Fichero HimnoCentenario.txt
		String entrada =args[0]; //args[0];
		//C:\\ruta hasta contador.java
		String ruta = args[1];//args[1];
		
		//OJO MAYUSCULAS Y MINUSCULAS
		String[] vocales = { "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z" };
		
		String classPath=System.getProperty("user.dir");
		
		System.out.println("Usando ruta:" + ruta);
		System.out.println("Usando classpath: "+classPath);
		System.out.println("usando classpath + ruta: "+classPath + ruta);
		
		/* Se lanzan los procesos*/
		for (int i = 0; i < vocales.length; i++) {
		String fichErrores = "Errores_" + vocales[i] + ".txt";
		ProcessBuilder pb = new ProcessBuilder("java", classPath + ruta, entrada, vocales[i], vocales[i] + ".txt");
		//Si hay algún error, almacenarlo en un fichero
		pb.redirectError(new File(fichErrores));
		pb.start();
		//fin del for
		}
		
		Thread.sleep(1000);
		String res="RES.txt";
		File f= new File("RES.txt");
		PrintWriter pw= Contador.getPrintWriter(res);
		System.out.println("procediendo a la lectura..");
		for(int i=0;i<vocales.length;i++) {
			String cad="el numero de "+vocales[i]+" es: "+String.valueOf(getResultadoFichero(vocales[i]+".txt"));
			System.out.println(cad);
			pw.append(cad+"\n");
		}
		pw.close();
	}
}
