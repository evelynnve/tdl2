package Entregable;

import java.util.List;
/** clase de billetera virtual
 * @author Grupo34
 * @version 1.0
 *  
 */

public class BilleteraVirtual {
	private double saldoTotal;
	private List<Moneda> moneda;
	
	public BilleteraVirtual () {
		
	}
	/**
	 * 
	 * @param saldoTotal
	 * @param moneda (objeto moneda)
	 */
	public BilleteraVirtual (double saldoTotal, List<Moneda> moneda) {
		this.saldoTotal= saldoTotal;
		this.moneda= moneda;
	}
	/**
	 * 
	 * @return saldoTotal
	 */
	public double getSaldoTotal() {
		return saldoTotal;
	}
	/**
	 * 
	 * @param saldoTotal
	 */
	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
	/**
	 * 
	 * @return moneda
	 */
	public List<Moneda> getMoneda() {
		return moneda;
	}
	/**
	 * 
	 * @param moneda
	 */
	public void setMoneda(List<Moneda> moneda) {
		this.moneda = moneda;
	}
}
