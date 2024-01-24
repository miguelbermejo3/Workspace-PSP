package impresora;

public class Usuario implements Runnable {

	private String nombre;
	private Impresora impresora;
	
	public Usuario(String nombre, Impresora impresora) {
		this.nombre = nombre;
		this.impresora = impresora;
	}
	
	public void escribir() {
		for (int i = 1; true; i++) {
			String texto = "Texto " + i;
			try {
				impresora.imprimir(nombre, texto);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		escribir();
		
	}

}
