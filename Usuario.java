package Entregable;
/** clase de usuario
 * @author Grupo34
 * @version 1.1
 */

public class Usuario {
  private String userName;
  private String contrasenia;
  private List<String> estadoAltasBajas;
  private List<Tarjetas> tarjetas;

  public class Usuario (){

  }

  public class Usuario (String userName, String contrasenia, List<String> estadoAltasBajas, List<Tarjetas> tarjetas) {
    this.userName= username;
    this.contrasenia= contrasenia;
    this.estadoAltasBajas= estadoAltasBajas;
    this.tarjetas= tarjetas;
  }
  /**
	 * 
	 * return userName (nombre de usuario)
	 */
  public String userName() {
    return username;
  }
  /**
	 * 
	 * @param userName (nombre del usuario)
	 */
  public void setUserName(String userName) {
    this.userName= userName;
  }
  /**
	 * 
	 * @return contrasenia
	 */
	public String getContrasenia() {
		return contrasenia;
	}
	/**
	 * 
	 * @param contrasenia
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	/**
	 * 
	 * @return estadoBajaAlta
	 */
	public List<String> isEstadoBajaAlta() {
		return estadoBajaAlta;
	}
	/**
	 * 
	 * @param estadoBajaAlta
	 */
	public void setEstadoBajaAlta(List<String> estadoBajaAlta) {
		this.estadoBajaAlta = estadoBajaAlta;
	}
  /**
	 * 
	 * @return tarjetas
	 */
  public List<Tarjetas> getTarjetas() {
    return tarjetas;
  }
  /**
	 * 
	 * @param tarjetas
	 */
  public void setTarjetas(List<Tarjetas> tarjetas){
    this.tarjetas= tarjetas;
  }
}
