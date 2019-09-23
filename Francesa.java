package clases.cifo.com;

import java.util.ArrayList;

public class Francesa extends Baraja {
	
		public Francesa() {
			cartas = new ArrayList<Carta>();
			reiniciar();
		}

		public void reiniciar() {
			String[] palos = {"picas","tréboles","diamantes","corazones"};
			String[] nombres = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
			Carta carta;
			String n;
			short v;
			
			// Si existe, borra baraja
			if(!cartas.isEmpty()) {
				cartas.clear();
			}
			// Crear la baraja francesa
			for(int i=0; i<nombres.length; i++) {
				n = nombres[i];
				if(i<10) v = (short) (i+1);
				else v = 10;
				for(String p:palos) {
					carta = new Carta(p,n,v);
					cartas.add(carta);
				}
			}
		}
}
