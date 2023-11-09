package actividad3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Proceso {

	public static void main(String[] args) {
		try {

			File directorioBin = new File("C:\\Users\\mbermejo8774\\Workspace-psp\\Tema1\\bin\\ejercicio2");

			if (!directorioBin.exists() || !directorioBin.isDirectory()) {
				System.err.println("El directorio 'bin' no existe.");
				return;
			}

			String programaJava = "Eclipse IDE for Java Developers - 2023-06";

			String rutaProgramaJava = "C:\\Users\\mbermejo8774\\Workspace-psp\\Tema1\\bin\\ejercicio2" + programaJava
					+ "Procesos.class";

			String comando = "java -cp " + directorioBin.getAbsolutePath() + " " + programaJava;

			Process proceso = Runtime.getRuntime().exec(comando);

			InputStream inputStream = proceso.getInputStream();

			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

			
			int caracter;
			while ((caracter = bufferedReader.read()) != -1) {
				System.out.print((char) caracter);
			}

			bufferedReader.close();
			inputStreamReader.close();
			inputStream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
