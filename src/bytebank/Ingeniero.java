package bytebank;

public class Ingeniero extends Funcionario implements Autenticable{
	//@Override
	private AutenticacionUtil util;
	
	public Ingeniero() {
		this.util = new AutenticacionUtil();
	}
	
	public Double getBonificacion() {
		// TODO Auto-generated method stub
		// o calcular bonificacion de empleados
		return 0.0;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		this.util.setClave(clave);
		// se desarrolla o implementa
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		// se desarrolla o implementa
		return this.util.iniciarSesion(clave);
	}
}
