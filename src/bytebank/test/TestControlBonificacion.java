package bytebank.test;

import bytebank.modelo.Contador;
import bytebank.modelo.ControlBonificacion;
import bytebank.modelo.Funcionario;
import bytebank.modelo.Gerente;
import bytebank.modelo.Ingeniero;

public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario rene = new Ingeniero();
		rene.setSalario(2000.0);
		rene.setDocumento("12345");
		rene.setNombre("Rene Avila");
		rene.setTipo(0);
		System.out.println("Pase x TestControlBonificacion");
	
		Gerente jimena=new Gerente();
		jimena.setSalario(10000.0);
		jimena.setTipo(1);
		
		Contador alexis=new Contador();
		alexis.setSalario(5000.0);
		
		ControlBonificacion ctrlBonif = new ControlBonificacion();
		ctrlBonif.RegistrarSalario(rene);
		ctrlBonif.RegistrarSalario(jimena);
		ctrlBonif.RegistrarSalario(alexis);
				
	}

}

