package bytebank;

public class TestGerente {

	public static void main(String[] args) {
		Gerente gerente=new Gerente();
//		luis.setNombre("Luis");
//		luis.setDocumento("4455");
//		luis.setSalario(1500.0);
		//Funcionario gerente=new Funcionario();
		gerente.setSalario(5000.0);
		gerente.setTipo(1);
		gerente.setClave("AluraCursosOnLine");
		System.out.println("Salario gerente "+gerente.getSalario());
		System.out.println("Bonificacion gerente "+gerente.getBonificacion());
		System.out.println("Inicia sesion "+gerente.iniciarSesion("AluraCursosOnLine"));
	}

}
