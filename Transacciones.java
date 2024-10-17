package Entregable;
/** super clase de compra y venta o enviar y recibir
 * @author Grupo34
 * @version 1.0
 *  
 */
public class Transacciones {
	private String direccion;

	public Transacciones () {
		
	}
	/**
	 * 
	 * @param direccion (de la billetera)
	 */
	public Transacciones (String direccion) {
	this.direccion= direccion;	
	}
	/**
	 * 
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
