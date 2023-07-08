package bytebank;

public class SistemaInterno {
	private String clave = "12345";
	public boolean autenticar(Autenticable gerente) {
		boolean puedeIniciarSesion=gerente.iniciarSesion(clave);
		if(puedeIniciarSesion) {
			System.out.println("Login Exitoso");
			return true;
		}else {
			System.out.println("Error en clave");
			return false;
		}
	}
}
