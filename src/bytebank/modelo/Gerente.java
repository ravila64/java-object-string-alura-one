package bytebank.modelo;

public class Gerente extends Funcionario implements Autenticable{
	
		// sobre escritura de metodos
	//@Override
	public Double getBonificacion() {
      System.out.println("Llamando metodo del Gerente");
      return 2000.0; // super.getSalario()+super.getSalario()*0.05;
	}

	// clase Autenticable abstracta
	@Override
	public boolean iniciarSesion(String clave) {
		// TODO se implementa logica de iniciar sesion en gerente
		return false;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		// falta implementar 
	}

}
