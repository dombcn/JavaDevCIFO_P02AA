import clases.cifo.com.*;
import java.util.Scanner;
import java.util.ArrayList;

public class PartidaPoker {
	
	public static void main(String[] args) {
		// Aplicación de consola que usa la clase Poker
		Poker partida;
		Scanner sc = new Scanner(System.in);
		int num;
		String nombreJug = "";
		Jugador jugador;
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		boolean ok;
		
		System.out.println("PARTIDA DE POKER");
		// Entrar número de jugadores de la partida
		do {
			System.out.println("Entra el número de jugadores:");
			num = sc.nextInt();
			sc.nextLine();
			if(num<3) System.out.println("Como mínimo 3 jugadores.");
		} while(num<3);
		// Entrar los nombres de los jugadores de la partida
		for(int i=1; i<=num; i++) {
			do {
				System.out.println("Entra el nombre del jugador "+i+":");
				nombreJug = sc.nextLine();
				if(nombreJug.length() > 0) {
					jugador = new Jugador(nombreJug);
					jugadores.add(jugador);
					ok = true;
				}
				else ok = false;
			} while(!ok);
		}
		sc.close();
		
		// Crea la partida de Poker
		try {
			partida = new Poker(jugadores);
			// Mostrar la baraja y los jugadores de la partida
			partida.mostrarBaraja();
			partida.mostrarJugadores();
			// Prueba añadir otro jugador a la partida
			try {
				jugador = new Jugador("Domènec");
				partida.addJugador(jugador);
				// Mostrar los jugadores de la partida
				partida.mostrarJugadores();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
