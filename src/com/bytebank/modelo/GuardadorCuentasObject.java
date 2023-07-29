package com.bytebank.modelo;
import com.bytebank.modelo.banco.Cuenta;
public class GuardadorCuentasObject {
	private Object[] referencias;
    private int posicionLibre;
    public GuardadorCuentasObject() {
        this.referencias = new Object[10];
        this.posicionLibre = 0;
    }
    public void adicionar(Object ref) {
        referencias[this.posicionLibre] = ref;
        this.posicionLibre++;
    }
    public int getCantidadDeElementos() {
        return this.posicionLibre;
    }
    public Object getReferencia(int pos) {
        return this.referencias[pos];
    }
}
