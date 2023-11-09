package actividad1;

public class App {

	public void iniciar(String ruta) {

		Process pb;
		try {
			pb = new ProcessBuilder(ruta).start();
			//pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		String ruta = "C:\\Program Files\\Notepad++\\notepad++.exe";

		App app = new App();
		app.iniciar(ruta);
		System.out.println("finalizado");

	}

}
