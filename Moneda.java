package Entregable;
/** super clase de moneda
 * @author Grupo34
 * @version 1.0
 */
public class Moneda {
	private String nombre;
	private double valor;
	private String simbolo;
	private double cantidad;
	
	public Moneda () {
		
	}
	/**
	 * 
	 * @param nombre
	 * @param valor
	 */
	public Moneda (String nombre, double valor, String simbolo, double cantidad) {
		this.setNombre(nombre);
		this.setValor(valor);
		this.setSimbolo(simbolo);
		this.setCantidad(cantidad);
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
	/**
	 * 
	 * @return simbolo
	 */
	public String getSimbolo() {
		return simbolo;
	}
	/**
	 * 
	 * @param simbolo
	 */
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	/**
	 * 
	 * @param cantidad
	 */
	public double getCantidad() {
		return cantidad;
	}
	/**
	 * 
	 * @param cantidad
	 */
	public void setCantidad(double cantidad){
		this.cantidad= cantidad;
	}
}
