package clases.cifo.com;

import java.util.ArrayList;

public class Poker {
	// Para jugar partidas de Póker
	private Francesa baraja;
	private ArrayList<Jugador> jugadores;
	
	// Crear la partida de Póker pasándole los jugadores
	public Poker(ArrayList<Jugador> jugAL) throws Exception {
		String nj = "";
		
		if(jugAL.size()<3) throw (new Exception("Como mínimo 3 jugadores."));
		// Añadir jugadores
		jugadores = new ArrayList<Jugador>();
		for(Jugador j1:jugAL) {
			nj = j1.getNombre();
			for(Jugador j2:jugadores) {
				// Si ya existe un jugador con el mismo nombre
				if(nj.equalsIgnoreCase(j2.getNombre()))
					throw (new Exception("Nombre de jugador repetido."));
			}
			jugadores.add(j1);
		}
		baraja = new Francesa();
	}
	
	// Añadir otro jugador a la partida de Póker
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
	
	// Mostrar las cartas de la baraja Francesa
	public void mostrarBaraja () {
		baraja.mostrar();
	}
	
	// Mostrar los jugadores de la partida de Póker
	public void mostrarJugadores () {
		System.out.println("JUGADORES:");
		for(Jugador j:jugadores) {
			System.out.println(j.getNombre());
		}
	}
}
