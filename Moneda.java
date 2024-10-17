package Entregable;
/** super clase de moneda
 * @author Grupo34
 * @version 1.0
 */
public class Moneda {
	private String nombre;
	private double valor;
	
	public Moneda () {
		
	}
	/**
	 * 
	 * @param nombre
	 * @param valor
	 */
	public Moneda (String nombre, double valor) {
		this.setNombre(nombre);
		this.setValor(valor);
	}
	/**
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return valor
	 */
	public double getValor() {
		return valor;
	}
	
	/**
	 * 
	 * @param valor
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
}
