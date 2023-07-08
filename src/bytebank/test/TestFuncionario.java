package bytebank.test;

import bytebank.modelo.Funcionario;
import bytebank.modelo.Ingeniero;

public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario rene = new Ingeniero();
		rene.setNombre("Rene A");
		rene.setDocumento("79");
		rene.setSalario(5000.0);
		
		System.out.println(rene.getNombre());
		System.out.println(rene.getDocumento());
		System.out.println(rene.getSalario());
		System.out.println(rene.getBonificacion());

	}

}
