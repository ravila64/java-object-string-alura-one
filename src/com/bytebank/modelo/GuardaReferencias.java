package com.bytebank.modelo;
import com.bytebank.modelo.banco.Cuenta;

public class GuardaReferencias {
	// crear un objeto para guardar muchas referencias
	// Permitir agregar varios objectos, con OBJECT
	// guardareferencias.adiciona(referencia);
	// obtener, remover, etc.
	Object[] referencia = new Object[10];
	int indice=0;
	
	public void adicionar(Object cc) {
		referencia[indice]=cc;
		indice++;
	}
	public Object obtener(int ind) {
		return referencia[ind];
	}
	public int getCantidadDeElementos() {
        return this.indice;
    }
}
