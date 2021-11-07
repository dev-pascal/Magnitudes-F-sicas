package segundaentrega;

import segundaentrega.Convertidor.Unidad;

public class Longitud_Internacional extends Fundamental_Internacional {

	private Unidad unidad = null;
	
	public Longitud_Internacional() {
		super();
	}

	public Longitud_Internacional(float f, Unidad unidad) {
		super(f);
		this.unidad = unidad;
	}
	
	public Unidad getUnidad () {
		return this.unidad;
	}

}
