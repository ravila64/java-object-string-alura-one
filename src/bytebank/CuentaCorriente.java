package bytebank;

public class CuentaCorriente extends Cuenta implements Tributacion{
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	@Override
	// metodo que tambien existe en Cuenta()
	// Se cambio de boolean a void en la clase padre
	public void retirar(double valor) throws SaldoInsuficienteException {
		// TODO Auto-generated method stub
		double comision = 0.20;
		super.retirar(valor + comision);
	}
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		this.saldo = this.saldo + valor;	
	}
	// new -> haga lo que hicimos en el aula
	@Override
	public double getValorImpuesto() {
		return super.saldo * 0.01;
	}
}
