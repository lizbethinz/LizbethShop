package com.Tienda.Persistencia;
import java.sql.*;


public class MysqlConnection {

	InformacionBD informacionBD = new InformacionBD();
	public MysqlConnection(){
		
	}
	
	
	public Connection abrir() throws SQLException, ClassNotFoundException{
		Class.forName(informacionBD.Driver);
		String url = informacionBD.Url+informacionBD.BD;
		
		Connection conn = DriverManager.getConnection(url, informacionBD.Usuario, informacionBD.Contrasena);
		
		return conn;
		
	}
	
}
