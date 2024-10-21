package Conexion;

import java.util.Comparator;

public class CompararNomenclatura implements Comparator<Moneda> {
	public int compare(Moneda m1, Moneda m2) {
		if (!(m1.getSimbolo().equals(m2.getSimbolo())))
			return m1.getSimbolo().compareTo(m2.getSimbolo());
		else
			return m1.getSimbolo().compareTo(m2.getSimbolo());
	}
}
