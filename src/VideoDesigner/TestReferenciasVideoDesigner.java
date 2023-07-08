package VideoDesigner;

import bytebank.ControlBonificacion;
import bytebank.Gerente;

public class TestReferenciasVideoDesigner {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
        g1.setNombre("Marcos");
        g1.setSalario(5000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControlBonificacion controle = new ControlBonificacion();
        controle.RegistrarSalario(g1);
        controle.RegistrarSalario(ev);
        controle.RegistrarSalario(d);

        System.out.println(controle.getSuma());

	}

}
