import java.util.Scanner;

import clases.cifo.com.*;

public class PartidaMus {

	public static void main(String[] args) {
		// Aplicación de consola que usa la clase Mus
		Mus partida = new Mus();
		Scanner sc = new Scanner(System.in);
		String nombreJug = "";
		Jugador jugador;
		boolean ok;
		
		System.out.println("PARTIDA DE MUS");
		// Entrar los 4 jugadores de la partida
		for(int i=1; i<=4; i++) {
			do {
				System.out.println("Entra el nombre del jugador "+i+":");
				nombreJug = sc.nextLine();
				if(nombreJug.length() > 0) {
					try {
						jugador = new Jugador(nombreJug);
						partida.addJugador(jugador);
						ok = true;
					} catch (Exception e) {
						System.out.println(e.getMessage());
						ok = false;
					}
				}
				else ok = false;
			} while(!ok);
		}
		sc.close();
		
		// Mostrar la baraja y los jugadores de la partida
		partida.mostrarBaraja();
		partida.mostrarJugadores();
	}

}
