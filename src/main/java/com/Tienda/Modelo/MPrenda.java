package com.Tienda.Modelo;
import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.*;

import com.Tienda.Catalogo.Constructor.Prendas;
import com.Tienda.Persistencia.*;

public class MPrenda {
	MysqlConnection conn = new MysqlConnection();
	PPrenda prendaP = new PPrenda();
	
	public Prendas Select(Prendas prenda)throws Exception {
		String armarQuery = "select * from prendas where "+prendaP.Id+" =" +prenda.getId();
        Statement abrirConexion = null;
        ResultSet ejecutar = null;
		
        try {
        	abrirConexion = (Statement) conn.abrir().createStatement();
        	ejecutar = ((java.sql.Statement) abrirConexion).executeQuery(armarQuery);
        	
        	while(ejecutar.next()) {
        		prenda.setId(ejecutar.getInt(prendaP.Id)) ;
        		prenda.setCodigo(ejecutar.getString(prendaP.Codigo));
        		prenda.setDescripcion(ejecutar.getString(prendaP.Descripcion));
        		prenda.setPrecio(ejecutar.getString(prendaP.Precio));
        		prenda.setClasificacion(ejecutar.getInt(prendaP.Clasificacion)) ;

        	}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print(e.getMessage().toString());
			throw e;
		}
       
        
		return prenda;
		
	}
}
