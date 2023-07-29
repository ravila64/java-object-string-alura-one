package com.bytebank.modelo;

import com.bytebank.modelo.banco.Cuenta;

public class GuardadorDeCuentas {
	private Cuenta[] referencias;
    private int posicionLibre;

    public GuardadorDeCuentas() {
        this.referencias = new Cuenta[10];
        this.posicionLibre = 0;
    }

    public void adicionar(Cuenta ref) {
        referencias[this.posicionLibre] = ref;
        this.posicionLibre++;
    }

    public int getCantidadDeElementos() {
        return this.posicionLibre;
    }

    public Cuenta getReferencia(int pos) {
        return this.referencias[pos];
    }

}
