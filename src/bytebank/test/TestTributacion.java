package bytebank.test;

import bytebank.modelo.CalcularImpuesto;
import bytebank.modelo.CuentaCorriente;
import bytebank.modelo.SeguroDeVida;

public class TestTributacion {
	public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(222, 333);
        cc.depositar(100.0);
        SeguroDeVida seguro = new SeguroDeVida();
        CalcularImpuesto calc = new CalcularImpuesto();
        calc.registrar(cc);
        calc.registrar(seguro);
        System.out.println(calc.getTotalImpuesto());
	}
}
