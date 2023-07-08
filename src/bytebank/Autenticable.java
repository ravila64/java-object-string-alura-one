package bytebank;

// todos los metodos de la interfaces son abstractas, 
// se puede quitar la palabra abstract x ser interface

public interface Autenticable {
	// se quita extends Funcionario, egun modelo 
	// NO PUEDEN TENER METODOS IMPLEMENTADOS
	public void setClave(String clave);
	public boolean iniciarSesion(String clave);
}
