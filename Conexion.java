package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexionn {
	Connection cx= null;
	
	public Connection conectar() {
		try {
			Class.forName("org.sqlite.JDBC");
			cx= DriverManager.getConnection("jdbc:sqlite:billeteraDB.db");
			System.out.println("Conexion exitosa");
			creacionDeTablasEnBD(cx);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cx;
	}
	
	public void desconectar() {
		try {
			cx.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main (String[]args) {
		Conexionn cx=new Conexionn();
		cx.conectar();
	}
	
	private static void creacionDeTablasEnBD(Connection cx) throws 
    SQLException {
Statement stmt;
stmt = cx.createStatement();
String sql = "CREATE TABLE MONEDA " 
+ "(" 
+ " TIPO       VARCHAR(1)    NOT NULL, "
+ " NOMBRE       VARCHAR(50)    NOT NULL, " 
+ " NOMENCLATURA VARCHAR(10)  PRIMARY KEY   NOT NULL, "
+ " VALOR_DOLAR	REAL     NOT NULL, " 
+ " VOLATILIDAD	REAL     NULL, "
+ " STOCK	REAL     NULL "  + ")";
stmt.executeUpdate(sql);
sql = "CREATE TABLE ACTIVO_CRIPTO" 
+ "(" 
+ " NOMENCLATURA VARCHAR(10)  PRIMARY KEY     NOT NULL, "
+ " CANTIDAD	REAL    NOT NULL " + ")";
stmt.executeUpdate(sql);
sql = "CREATE TABLE ACTIVO_FIAT" 
+ "(" 
+ " NOMENCLATURA VARCHAR(10)  PRIMARY KEY     NOT NULL, "
+ " CANTIDAD	REAL    NOT NULL " + ")";
stmt.executeUpdate(sql);
sql = "CREATE TABLE TRANSACCION" 
+ "(" 
+ " RESUMEN VARCHAR(1000)   NOT NULL, "
+ " FECHA_HORA		DATETIME  NOT NULL " + ")";
stmt.executeUpdate(sql);
stmt.close();
}

}
