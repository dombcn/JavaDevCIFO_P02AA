package clases.cifo.com;

import java.util.ArrayList;

public class Jugador {
	private String nombre;
	private ArrayList<Carta> cartas;
	
	public Jugador(String n) {
		nombre = n;
		cartas = new ArrayList<Carta>();
	}
	
	public void setNombre(String n) {
		nombre = n;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void darCarta(Carta carta) {
		cartas.add(carta);
	}
	
	public Carta retirarCarta(int indice) {
		return cartas.remove(indice);
	}
	
	// Devuelve un string indicando las cartas que tiene el jugador
	public String juego() {
		String str = "";
		for(Carta carta:cartas) {
			str = str.concat(carta.toString()+", ");
		}
		if(str.length()>0) str = str.substring(0,str.length()-2);
		return "["+str+"]";
	}
}
