package Entregable;

import java.util.List;

/** esta clase representa la compra y venta de criptomonedas
 * @author Grupo34
 * @version 1.0
 *  
 */

public class Compra extends Transacciones {
	private List<Double> tasaDeCambio;
	private List<Double> comAplicables;
	private Fiat montoTotal;
	
	public CompraVenta () {
		
	}
	/**
	 * 
	 * @param tasaDeCambio (en tiempo real)
	 * @param comAplicables (comisiones)
	 * @param montoTotal (en moneda Fiat)
	 */
	public CompraVenta (List<Double> tasaDeCambio, List<Double> comAplicables, Fiat montoTotal) {
		this.setTasaDeCambio(tasaDeCambio);
		this.setComAplicables(comAplicables);
		this.setMontoTotal(montoTotal);
	}
	
	/**
	 * 
	 * @return retorna la tasa de cambio tasaDeCambio en tiempo real
	 */
	public List<Double> getTasaDeCambio() {
		return tasaDeCambio;
	}
	/**
	 * 
	 * @param modifica la tasa de cambio (tasaDeCambio) en tiempo real
	 */
	public void setTasaDeCambio(List<Double> tasaDeCambio) {
		this.tasaDeCambio = tasaDeCambio;
	}
	/**
	 * 
	 * @return retorna las comisiones aplicables (comAplicables) 
	 */
	public List<Double> getComAplicables() {
		return comAplicables;
	}
	/**
	 * 
	 * @param modifica las comisiones aplicables (comAplicables) 
	 */
	public void setComAplicables(List<Double> comAplicables) {
		this.comAplicables = comAplicables;
	}
	/**
	 * 
	 * @return retorna el monto total (montoTotal) 
	 */
	public double getMontoTotal() {
		return montoTotal;
	}
	/**
	 * 
	 * @param modifica el monto total (montoTotal)
	 */
	public void setMontoTotal(Fiat montoTotal) {
		this.montoTotal = montoTotal;
	}
}
