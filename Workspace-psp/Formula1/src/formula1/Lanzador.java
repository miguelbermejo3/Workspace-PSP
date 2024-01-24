
package formula1;

public class Lanzador {
	public static void main(String[] args) {
		Carrera carrera = new Carrera(1000);
		Coche cocheAlonso = new Coche("Alonso", 100, carrera);
		Coche cocheHamilton = new Coche("Hamilton", 101, carrera);
		Coche cocheSainz = new Coche("Sainz", 99, carrera);
		
		Thread hiloAlonso=new Thread(cocheAlonso);
		Thread hiloHamilton=new Thread(cocheHamilton);
		Thread hiloSainz=new Thread(cocheSainz);
		
		hiloAlonso.start();
		hiloHamilton.start();
		hiloSainz.start();
		
		
		try {
			hiloAlonso.join();
			hiloHamilton.join();
			hiloSainz.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
