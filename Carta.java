package clases.cifo.com;

public class Carta {
	private String palo;
	private String nombre;
	private short valor;
	
	public Carta(String p, String n, short v) {
		palo = p;
		nombre = n;
		valor = v;
	}
	
	public void setPalo(String p) {
		palo = p;
	}
	
	public void setNombre(String n) {
		nombre = n;
	}
	
	public void setValor(short v)  {
		valor = v;
	}
	
	public String getPalo() {
		return palo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public short getValor() {
		return valor;
	}
	
	public String toString() {
		return nombre+" de "+palo;
	}
}
