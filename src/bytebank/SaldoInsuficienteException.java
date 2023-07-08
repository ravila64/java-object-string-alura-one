package bytebank;
// Cambiar  RuntimeException x Exception
public class SaldoInsuficienteException extends Exception {
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
