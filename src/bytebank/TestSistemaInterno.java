package bytebank;

public class TestSistemaInterno {

	public static void main(String[] args) {
		SistemaInterno sistema=new SistemaInterno();
		Gerente gerente1=new Gerente();
		Administrador admin=new Administrador();
		
		sistema.autenticar(gerente1);
		sistema.autenticar(admin);
		
	}

}
