package Entregable;
/** clase de usuario
 * @author Grupo34
 * @version 1.0
 */
public class Persona{
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private String pais;
	private String email;
	
	public Persona () {
		
	}
	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 * @param pais
	 * @param email
	 * @param contrasenia
	 * @param estadoBajaAlta
	 */
	public Usuario (String nombre, String apellido, String fechaNacimiento, String pais, String email) {
		this.nombre= nombre;
		this.apellido= apellido;
		this.fechaNacimiento= fechaNacimiento;
		this.pais= pais;
		this.email= email;
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
	 * @return apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * 
	 * @return fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * 
	 * @param fechaNacimiento
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * 
	 * @return pais
	 */
	public String getPais() {
		return pais;
	}
	/**
	 * 
	 * @param pais
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	/**
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
