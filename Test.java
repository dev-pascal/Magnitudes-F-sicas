package segundaentrega;

import java.util.ArrayList;

public class Test {
	public static void main (String args[]) {
		SondaEspacial<Metro> sonda = new SondaEspacial<Metro>();
		ArrayList<Longitud_Ingl�s> lista = new ArrayList<Longitud_Ingl�s>();
		lista.add(new Pie((float)23.5));
		lista.add(new Yarda((float)50));
		lista.add(new Yarda((float)13));
		lista.add(new Pie((float)10));
		for (Longitud_Ingl�s i: lista) {
			Convertidor convertidor = new Convertidor();
			Metro m = (Metro) convertidor.convertir(i, i.getUnidad());
			sonda.metodo(m);
		}
	}
}
