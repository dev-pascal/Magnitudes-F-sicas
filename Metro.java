package segundaentrega;

import segundaentrega.Convertidor.Unidad;

public class Metro extends Longitud_Internacional {
	private Unidad unidad = Unidad.METRO;
	public Metro () {
		super();
	}
	public Metro (float f) {
		super(f, Unidad.METRO);
	}
	public Unidad getUnidad() {
		return unidad;
	}
}
