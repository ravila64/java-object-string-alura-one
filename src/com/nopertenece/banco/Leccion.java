package com.nopertenece.banco;
public class Leccion {
	private String titulo;
    private int tiempo;

    public Leccion(String titulo, int tiempo) {
        this.titulo = titulo;
        this.tiempo = tiempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String toString() {
        return "[título: " + titulo + ", tiempo: " + tiempo + " minutos]";
    }
	
}
