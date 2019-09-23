import clases.cifo.com.*;

public class Prueba2_Baraja {

	public static void main(String[] args) {
		// Prueba de las clases Baraja, Francesa y Espanyola
		Francesa barajaF;
		Espanyola barajaE;
		Carta[] cartasRep = new Carta[4];
		
		// Crear baraja Francesa
		barajaF = new Francesa();
		
		// Mostrar baraja Francesa, barajar y volver a mostrar
		System.out.println("___ BARAJA FRANCESA ___");
		barajaF.mostrar();
		barajaF.barajar();
		System.out.println("*** DESPUES DE BARAJAR ***");
		barajaF.mostrar();
		
		// Repartir 4 cartas, mostrarlas y volver a mostrar la baraja
		cartasRep[0] = barajaF.repartir();
		cartasRep[1] = barajaF.repartir();
		cartasRep[2] = barajaF.repartir();
		cartasRep[3] = barajaF.repartir();
		System.out.println("*** CARTAS REPARTIDAS ***");
		for(int i=0; i<4; i++) {
			System.out.println("Carta "+(i+1)+" repartida: "+cartasRep[i].toString());
		}
		System.out.println("*** DESPUES DE REPARTIR ***");
		barajaF.mostrar();
		
		// Reiniciar baraja
		barajaF.reiniciar();
		System.out.println("*** DESPUES DE REINICIAR ***");
		barajaF.mostrar();
		
		// Crear baraja Española
		barajaE = new Espanyola();
		
		// Mostrar baraja Española, barajar y volver a mostrar
		System.out.println("___ BARAJA ESPAÑOLA ___");
		barajaE.mostrar();
		barajaE.barajar();
		System.out.println("*** DESPUES DE BARAJAR ***");
		barajaE.mostrar();
		
		// Repartir 4 cartas, mostrarlas y volver a mostrar la baraja
		cartasRep[0] = barajaE.repartir();
		cartasRep[1] = barajaE.repartir();
		cartasRep[2] = barajaE.repartir();
		cartasRep[3] = barajaE.repartir();
		System.out.println("*** CARTAS REPARTIDAS ***");
		for(int i=0; i<4; i++) {
			System.out.println("Carta "+(i+1)+" repartida: "+cartasRep[i].toString());
		}
		System.out.println("*** DESPUES DE REPARTIR ***");
		barajaE.mostrar();
		
		// Reiniciar baraja
		barajaE.reiniciar();
		System.out.println("*** DESPUES DE REINICIAR ***");
		barajaE.mostrar();
	}

}
