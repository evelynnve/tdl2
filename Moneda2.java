package Conexion;

	/** super clase de moneda
	 * @author Grupo34
	 * @version 1.0
	 */
public class Moneda {
	private String nombre;
	private double valor;
	private String simbolo;
	private double cantidad;
	private double volatilidad;	
	private String tipo;
	
	public Moneda () {
			
	}
	/**
	 * 
	 * @param nombre
	 * @param valor
	 */
	public Moneda (String tipo, String nombre, String simbolo, double valor, double volatilidad, double cantidad) {
		this.setTipo(tipo);
		this.setNombre(nombre);
		this.setValor(valor);
		this.setSimbolo(simbolo);
		this.setCantidad(cantidad);
		this.setVolatilidad(volatilidad);
	}
	/**
	 * 
	 * 		 * @return nombre
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
	
	public double getVolatilidad() {
		return volatilidad;
	}
	
	public void setVolatilidad(double volatilidad) {
		this.volatilidad = volatilidad;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String toString () {
		return ("Moneda de tipo: "+ this.getTipo() + " ,de nombre: " + this.getNombre() + ", nomenclatura: " + this.getSimbolo() + ", valor dolar: " + this.getValor() + ", stock: " + this.getCantidad() + ", con una volatilidad de: " + this.getVolatilidad());
	}
}
