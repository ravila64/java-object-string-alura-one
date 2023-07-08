package bytebank.modelo;

public abstract class Funcionario {
	private String nombre;
	private String documento;
	private Double salario;
	private int tipo;
	
	public Funcionario() {
		//super();
	}
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public Double getSalario() {
		return salario;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
// se manejara como metodo abstracto
// para spbre escribir en una clase hija
	public abstract Double getBonificacion();
//	{
//		//return this.salario * 0.05;
//	}
	
}
