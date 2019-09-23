import clases.cifo.com.*;

public class Prueba1_Carta_Jugador {

	public static void main(String[] args) {
		// Prueba de las clases Carta y Jugador
		Carta[] cartas = new Carta[10];
		Jugador j1, j2;
		Carta c;
		
		// Crear cartas
		cartas[0] = new Carta("Oros", "7", (short) 7);
		cartas[1] = new Carta("Oros", "Rey", (short) 10);
		cartas[2] = new Carta("Bastos", "1", (short) 1);
		cartas[3] = new Carta("Bastos", "4", (short) 4);
		cartas[4] = new Carta("Copas", "Sota", (short) 10);
		
		// Modificar cartas
		cartas[2].setPalo("Copas");
		cartas[3].setNombre("5");
		cartas[3].setValor((short) 5);
		
		// Mostrar cartas
		for(int i=0; i<5; i++) {
			// usando getters
			System.out.println("Carta "+i+": "+cartas[i].getPalo()+", "+cartas[i].getNombre()+", "+cartas[i].getValor());
			// usando toString()
			System.out.println(cartas[i].toString()+" (valor "+cartas[i].getValor()+")");
		}
		
		// Crear jugadores
		j1 = new Jugador("Pepe");
		j2 = new Jugador("Annah");
		
		// Modificar nombre
		j2.setNombre("Anna");
		
		// Dar cartas
		j1.darCarta(cartas[0]);
		j1.darCarta(cartas[3]);
		j1.darCarta(cartas[4]);
		j2.darCarta(cartas[1]);
		j2.darCarta(cartas[2]);
		
		// Mostrar jugadores y sus cartas
		System.out.println("Cartas jugador "+j1.getNombre()+": "+j1.juego());
		System.out.println("Cartas jugador "+j2.getNombre()+": "+j2.juego());
		
		// Retirar carta y mostrar 
		c = j1.retirarCarta(1);
		System.out.println("Carta retirada al jugador "+j1.getNombre()+": "+c.toString());
		System.out.println("Cartas jugador "+j1.getNombre()+": "+j1.juego());
		
	}

}
