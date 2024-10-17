package Entregable;

import java.util.List;

/** esta clase representa el swap de criptomonedas
 * @author Grupo34
 * @version 1.0
 *  
 */

public class Swap extends Transacciones {

	private List<Double> tasaDeMercado;
	private List<Double> comAplicables;
	
	public Swap (List<Double> tasaDeMercado,List<Double> comAplicables) {
		this.tasaDeMercado = tasaDeMercado;
		this.comAplicable = comAplicable;
	}
	/**
	 * 
	 * @return tasa de mercado
	 */
	public List<double> getTasaDeMercado() {
		return tasaDeMercado;
	}
	/**
	 * 
	 * @param tasa de mercado
	 */
	public void setTasaDeMercado(List<double> tasaDeMercado) {
		this.tasaDeMercado = tasaDeMercado;
	}
	/**
	 * 
	 * @return comision aplicada
	 */
	public List<double> getcomAplicable() {
		return comAplicable;
	}
	/**
	 * 
	 * @param comision aplicada
	 */
	public void setComAplicable(List<double> comAplicable) {
		this.comAplicable = comAplicable;
	}
}
