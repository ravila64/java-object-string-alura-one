package com.bytebank.modelo.banco;
/**
 * Cuenta va a crear instancias de cuenta corriente
 * @version 1.0
 * @author Rene Avila
 */

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.SaldoInsuficienteException;

// entidad cuenta, cambio abstract 23-06-2023
// implements Comparable // cuRSO  BE06
public abstract class Cuenta implements Comparable<Cuenta>{
	// public --> accesible desde cualquier parte
	// --default --> accesible dentro del paquete
	// --protected -->default + clases hijas
	// ---private --> accesible desde clase misma
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular=new Cliente();
	
	/* variable de la cuenta, pero no de la instancia*/
	/* la instancia es = new Cuenta(); */
	
	private static int total_validas = 0;
//	private static int total_no_validas=0;
	
	/* constructor */
	/** 
	 * Instancia una cuenta nueva
	 * */
	public Cuenta() {
	}
	
	/* constructor par agencia */
	/**	
	 * Instancia una cuenta usando agencia+numero
	 * @param agencia
	 * @param numero
	 */
	public Cuenta(int agencia, int numero) {
		if (agencia < 1) {
//			total_no_validas++;
			throw new IllegalArgumentException("Agencia inválida");
		}
		if(numero < 1) {
//			total_no_validas++;
            throw new IllegalArgumentException("Número de cuenta inválido");
        }
		total_validas++;
		this.numero = numero;
		this.agencia = agencia;
		System.out.println("Total cuentas validas "+total_validas);
//		System.out.println("Total cuentas no validas "+total_no_validas);
		System.out.println("Creando una cuenta !!! "+numero);
	}
	
	// se volvera abstracto este metodo, e implementar clases hijas
	public abstract void depositar(double valor); // video 06 cuenta abstracta de polimorfismo, curso BE03
	
//	public void depositar(double valor ) 
//	{
//		// THIS OBJECT
//		if (valor>0) {
//			this.saldo += valor;//this.saldo = this.saldo + valor;
//		}
//	}
	
	// retorna u n valor
	/**
	 * metodo retirar dinero cuenta y ocurre un error
	 * devuleve una excepcion
	 * @param valor 
	 * @throws SaldoInsuficienteException
	 */
	public void retirar(double valor) throws SaldoInsuficienteException  {
		if(this.saldo < valor) {
			//throw new SaldoInsuficienteException("No tienes saldo");
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}else {
			this.saldo -= valor;
		}
	}	
		

	public boolean transferir(double valor, Cuenta micuenta) throws SaldoInsuficienteException{
		boolean transfer=false;
		if(this.saldo >= valor && valor > 0) {
			//try {
				this.retirar(valor);
			//} catch (SaldoInsuficienteException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			//} // this.saldo -= valor; // this.saldo = this.saldo - valor 
			micuenta.depositar(valor); // micuenta.saldo = micuenta.saldo + valor;
			transfer = true;
		}
		return transfer;
	}
	
    /*  getters and settes */
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	
//	public void setSaldo(double saldo) {}
// esta clase fue reemplazada por depositar
	
	public int getAgencia() {
		return agencia;
	}

// ya no se utilizaria por que agencia se coloco en el constructor
	public void setAgencia(int agencia) {
		if (agencia>0) {
			this.agencia = agencia;
		}else {
			System.out.println("No asigne valores negativos");
		}
	}

	public Cliente getTitular() {
		return titular;
	}

/* no se utiliza en la logic del negocio, se utilizo para ejemplos */
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal_validas() {
		return total_validas;
	}
	
	public boolean esIgual(Cuenta cuenta) {
		return this.agencia==cuenta.getAgencia() && 
				this.numero == cuenta.getNumero();
	}
	
	@Override
	public boolean equals(Object obj) {
		Cuenta cuenta = (Cuenta) obj;
		return this.agencia==cuenta.getAgencia() && 
				this.numero == cuenta.getNumero();
	}
	
	@Override
	public int compareTo(Cuenta o) {
		// orden natural : numero de agencia
		// return Integer.compare(this.agencia, o.getAgencia());
		// orden natural x saldo
		return Double.compare(this.saldo, o.getSaldo());
	}
	
	@Override
	public String toString() {
		return "Cuenta-> [saldo=" + this.saldo + ", numero : "+this.numero+ ", agencia=" + this.agencia+ ", titular=" + titular.getNombre()+"]";
		// + ", numero=" + numero + ", titular=" + titular + "]";
		// return super.toString();
	}
}
 