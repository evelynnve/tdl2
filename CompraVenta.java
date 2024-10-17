package Entregable;

import java.util.List;

/** esta clase representa la compra y venta de criptomonedas
 * @author Grupo34
 * @version 1.0
 *  
 */

public class CompraVenta extends Transacciones {
	private List<Double> tasaDeCambio;
	private List<Double> comAplicables;
	private double montoTotal;
	
	public CompraVenta () {
		
	}
	/**
	 * 
	 * @param direccion (de la billetera)
	 * @param tasaDeCambio (en tiempo real)
	 * @param comAplicables (comisiones)
	 * @param montoTotal
	 */
	public CompraVenta (String direccion, List<Double> tasaDeCambio, List<Double> comAplicables, double montoTotal) {
		super (direccion);
		this.setTasaDeCambio(tasaDeCambio);
		this.setComAplicables(comAplicables);
		this.setMontoTotal(montoTotal);
	}
	
	/**
	 * 
	 * @return tasaDeCambio
	 */
	public List<Double> getTasaDeCambio() {
		return tasaDeCambio;
	}
	/**
	 * 
	 * @param tasaDeCambio
	 */
	public void setTasaDeCambio(List<Double> tasaDeCambio) {
		this.tasaDeCambio = tasaDeCambio;
	}
	/**
	 * 
	 * @return comAplicables
	 */
	public List<Double> getComAplicables() {
		return comAplicables;
	}
	/**
	 * 
	 * @param comAplicables
	 */
	public void setComAplicables(List<Double> comAplicables) {
		this.comAplicables = comAplicables;
	}
	/**
	 * 
	 * @return montoTotal
	 */
	public double getMontoTotal() {
		return montoTotal;
	}
	/**
	 * 
	 * @param montoTotal
	 */
	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
}
