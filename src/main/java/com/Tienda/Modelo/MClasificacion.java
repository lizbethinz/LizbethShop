package com.Tienda.Modelo;
//import java.beans.Statement;
import java.sql.*;
import java.sql.ResultSet;

import com.Tienda.Catalogo.Constructor.Clasificaciones;
import com.Tienda.Persistencia.MysqlConnection;
import com.Tienda.Persistencia.PClasificacion;


public class MClasificacion {
	MysqlConnection conn = new MysqlConnection();
	
	PClasificacion clasificacionP = new PClasificacion();
	
	public Clasificaciones Select(Clasificaciones clasificacion)throws Exception {
		String armarQuery = "select * from clasificaciones where "+clasificacionP.idClasificacion+" =" +clasificacion.getIdClasificacion();
        Statement abrirConexion = null;
        ResultSet ejecutar = null;
		
        try {
        	abrirConexion = (Statement) conn.abrir().createStatement();
        	ejecutar = ((java.sql.Statement) abrirConexion).executeQuery(armarQuery);
        	
        	while(ejecutar.next()) {
        		clasificacion.setIdClasificacion(ejecutar.getInt(clasificacionP.idClasificacion)) ;
        		clasificacion.setNombreClasificacion(ejecutar.getString(clasificacionP.nombreClasificacion));
        		clasificacion.setDescripcion(ejecutar.getString(clasificacionP.Descripcion));
        		

        	}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print(e.getMessage().toString());
			throw e;
		}
       
        
		return clasificacion;
		
	}
}
