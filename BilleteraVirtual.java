package Entregable;

import java.util.List;
/** clase de billetera virtual
 * @author Grupo34
 * @version 1.0
 *  
 */

public class BilleteraVirtual {
	private Fiat saldoTotalFIAT;
	private List<Moneda> moneda;
	private List<Transacciones> historial;
	
	public BilleteraVirtual () {
		
	}
	/**
	 * 
	 * @param saldoTotal
	 * @param moneda (objeto moneda)
	 */
	public BilleteraVirtual (double saldoTotalFIAT, List<Moneda> moneda, List<Transacciones> historial) {
		this.saldoTotalFIAT= saldoTotalFIAT;
		this.moneda= moneda;
		this.historial= historial;
	}
	/**
	 * 
	 * @return saldoTotalFIAT
	 */
	public double getSaldoTotalFIAT() {
		return saldoTotal;
	}
	/**
	 * 
	 * @param saldoTotalFIAT
	 */
	public void setSaldoTotalFIAT(double saldoTotalFIAT) {
		this.saldoTotalfiat = saldoTotalfiat;
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
	/**
	 * 
	 * @return historial
	 */
	public Transacciones getHistorial() {
		return historial;
	}

	public void setHistorial(List<Transacciones> historial) {
		this.historial.addAll(historial);
	}
}
