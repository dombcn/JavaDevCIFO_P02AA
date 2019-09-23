package clases.cifo.com;

import java.util.ArrayList;

public class Espanyola extends Baraja {
	
	public Espanyola() {
		cartas = new ArrayList<Carta>();
		reiniciar();
	}

	public void reiniciar() {
		String[] palos = {"espadas","bastos","oros","copas"};
		String[] nombres = {"1","2","3","4","5","6","7","Sota","Caballo","Rey"};
		Carta carta;
		String n;
		short v;
		
		// Si existe, borra baraja
		if(!cartas.isEmpty()) {
			cartas.clear();
		}
		// Crear la baraja española
		for(int i=0; i<nombres.length; i++) {
			n = nombres[i];
			if(i<7) v = (short) (i+1);
			else v = 10;
			for(String p:palos) {
				carta = new Carta(p,n,v);
				cartas.add(carta);
			}
		}
	}
}
