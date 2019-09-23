package clases.cifo.com;

import java.util.ArrayList;

public class Mus {
	// Para jugar partidas de Mus
	private Espanyola baraja = new Espanyola();
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	// Añadir los jugadores de la partida
	public void addJugador(Jugador jugador) throws Exception {
		String nj = "";
		
		for(Jugador j:jugadores) {
			nj = j.getNombre();
			// Si ya existe un jugador con el mismo nombre
			if(nj.equalsIgnoreCase(jugador.getNombre()))
				throw (new Exception("Ya existe un jugador con el mismo nombre."));
		}
		jugadores.add(jugador);
	}
	
	// Mostrar las cartas de la baraja Española
	public void mostrarBaraja () {
		baraja.mostrar();
	}
	
	// Mostrar los jugadores de la partida de Mus
	public void mostrarJugadores () {
		System.out.println("JUGADORES:");
		for(Jugador j:jugadores) {
			System.out.println(j.getNombre());
		}
	}
}
