package com.nopertenece.banco;

import java.util.ArrayList;
import java.util.List;

public class TestPrograma {
	public static void main(String[] args) {
		Leccion leccionIntro = new Leccion("Introducción a las Colecciones", 20);
        Leccion leccionModelando = new Leccion("Modelando la clase Leccion", 18);
        Leccion leccionSets = new Leccion("Trabajando con Conjuntos", 16);

        List<Leccion> lecciones = new ArrayList<Leccion>();
        lecciones.add(leccionIntro);
        lecciones.add(leccionModelando);
        lecciones.add(leccionSets);

       // Collections.sort(lecciones);
        // esta linea no funciono

        for (Leccion leccion : lecciones) {
            System.out.println(leccion);
        }
	}
	
}
