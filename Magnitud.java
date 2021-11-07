package segundaentrega;

public abstract class Magnitud {
	private float valor;
	public Magnitud () {
	}
	public Magnitud(float valor) {
		this.valor = valor;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
}
