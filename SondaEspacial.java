package segundaentrega;

public class SondaEspacial <T extends Magnitud> {
	private T dato;
	
	public SondaEspacial() {
	}
	
	public SondaEspacial(T dato) {
		super();
		this.dato = dato;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void metodo (T m) {
		this.setDato(m);
		System.out.println(this.getDato());
	}
	
}
