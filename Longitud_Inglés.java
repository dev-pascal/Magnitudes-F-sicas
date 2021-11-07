package segundaentrega;

import segundaentrega.Convertidor.Unidad;

public class Longitud_Inglés extends Fundamental_Inglés {

	Unidad unidad = null;
	
	public Longitud_Inglés () {
		super();
	}
	
	public Longitud_Inglés(float f, Unidad unidad) {
		super(f);
		this.unidad = unidad;
	}

	public Unidad getUnidad() {
		return unidad;
	}

}
