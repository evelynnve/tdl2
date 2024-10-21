package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ListarMonedas {
	private static Moneda monedas[];

	public static void main(String[] args) {
        Connection cx = null;
	        try {
	            cx = DriverManager.getConnection("jdbc:sqlite:billeteraDB.db");
	            System.out.println("Base de datos conectada");
	            String sql = "SELECT * FROM MONEDA";
	            Statement st = cx.createStatement();
	            ResultSet rs = st.executeQuery(sql);
	            monedas = null; int i=0;
	            while (rs.next()) {
	            	monedas[i].setTipo(rs.getString("TIPO"));
	            	monedas[i].setNombre(rs.getString("NOMBRE"));
	            	monedas[i].setSimbolo(rs.getString("NOMENCLATURA"));
	            	monedas[i].setValor(rs.getDouble("VALOR_DOLAR"));
	            	monedas[i].setVolatilidad(rs.getDouble("VOLATILIDAD"));
	            	monedas[i].setCantidad(rs.getDouble("STOCK"));
	            	i++;
	            }
	            Scanner s = new Scanner(System.in);
	            Arrays.sort(monedas, new CompararValorDolar());
	            System.out.println("Si desea imprimirlo por el orden de la nomclatura presione 1, (por default se ordena segun el valor dolar)");
	            int eleccion = s.nextInt();
	            if (eleccion == 1) {
	            	Arrays.sort(monedas, new CompararNomenclatura());
	            }
	            for (int j = 0; j <= i; j++) {
	            	System.out.println(monedas[j]);
	            }
	            
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            try {
	                if (cx != null) {
	                    cx.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }    
}
