package segundaentrega;

import segundaentrega.Convertidor.Unidad;

public class Longitud_Ingl�s extends Fundamental_Ingl�s {

	Unidad unidad = null;
	
	public Longitud_Ingl�s () {
		super();
	}
	
	public Longitud_Ingl�s(float f, Unidad unidad) {
		super(f);
		this.unidad = unidad;
	}

	public Unidad getUnidad() {
		return unidad;
	}

}
