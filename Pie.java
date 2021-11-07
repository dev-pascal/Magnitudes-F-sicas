package segundaentrega;

import segundaentrega.Convertidor.Unidad;

public class Pie extends Longitud_Inglés {
	private Unidad unidad = Unidad.PIE;
	
	public Pie() {
		super();
	}

	public Pie(float f) {
		super(f, Unidad.PIE);
	}

	public Unidad getUnidad() {
		return this.unidad;
	}
	
}
