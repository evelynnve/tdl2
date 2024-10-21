package Conexion;

import java.util.Comparator;

public class CompararValorDolar implements Comparator<Moneda> {
	public int compare(Moneda m1, Moneda m2) {
		return Double.compare(m1.getValor(), m2.getValor());
	}
}
