package segundaentrega;

import segundaentrega.Convertidor.Unidad;

public class Yarda extends Longitud_Inglés {
	private Unidad unidad = Unidad.YARDA;
	public Yarda () {
		super();
	}
	public Yarda (float valor) {
		super(valor, Unidad.YARDA);
	}
	public Unidad getUnidad () {
		return this.unidad;
	}
}
