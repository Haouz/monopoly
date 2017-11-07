package fiuba.algo3.tp2.modelo;

import java.util.ArrayList;

class Tablero {
	ArrayList<Casilla> casillas = new ArrayList<Casilla>();
	
	Tablero() {
		int i;
		for (i = 0; i < 20; i++) {
			casillas.add(new Casilla(i));
		}
	}
	
	Casilla getCasillaSiguiente(Casilla casilla, int posiciones) {
		return casillas.get(casilla.siguiente(posiciones));
	}
}