package segundaentrega;

public class Convertidor {
	
	public Convertidor () {
	}
	
	enum Unidad {
		METRO("1"), CENTIMETRO("0.01"), YARDA("0.9144"), PIE("0.3048");
		private Unidad (String unidad) {
			this.unidad=unidad;
		}
		private String getUnidad () {
			return this.unidad;
		}
		private String unidad;
		
	}

	public Magnitud convertir (Magnitud m, Unidad unidad) {
		float valor = m.getValor() * Float.parseFloat(unidad.getUnidad());
		Magnitud respuesta = new Metro(valor);
		return respuesta;
	}
}
