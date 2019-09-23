package clases.cifo.com;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Baraja {
	protected ArrayList<Carta> cartas;
	
	public void barajar() {
		Collections.shuffle(cartas);
	}
	
	public Carta repartir() {
		return cartas.remove(0);
	}
	
	abstract void reiniciar();
	
	public void mostrar() {
		System.out.println("BARAJA:");
		for(Carta c:cartas) {
			System.out.println(c.toString()+" (valor "+c.getValor()+")");
		}
	}
}
