package com.Tienda.Modelo;
//import java.sql.Statement;
//import java.sql.ResultSet;
import java.sql.*;

import com.Tienda.Catalogo.Constructor.Prendas;
import com.Tienda.Persistencia.*;

public class MPrenda {
	MysqlConnection conn = new MysqlConnection();
	PPrenda prendaP = new PPrenda();
	
	public Prendas Select(Prendas prenda)throws Exception {
		String armarQuery = "select * from prendas where "+prendaP.Id+" = "+prenda.getId() +";";
		
		
        Statement abrirConexion = null;
        ResultSet ejecutar = null;
		
        try {
        	abrirConexion = conn.abrir().createStatement();
        	ejecutar = abrirConexion.executeQuery(armarQuery);
        	
        	while(ejecutar.next()) {
        		prenda.setId(ejecutar.getInt(prendaP.Id)) ;
        		prenda.setCodigo(ejecutar.getString(prendaP.Codigo));
        		prenda.setDescripcion(ejecutar.getString(prendaP.Descripcion));
        		prenda.setPrecio(ejecutar.getString(prendaP.Precio));
        		prenda.setNombre(ejecutar.getString(prendaP.Nombre));
        		prenda.setClasificacion(ejecutar.getInt(prendaP.Clasificacion)) ;

        	}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print(e.getMessage().toString());
			throw e;
		}
       
        
		return prenda;
		
	}
	
	public Prendas Insert(Prendas prenda)throws Exception {
		String armarQuery = "INSERT INTO prendas"
                + "(Codigo, Descripcion, Precio, Nombre, Clasificacion) VALUES"
                + "(?,?,?,?,?)";
		
		
        //Statement abrirConexion = null;
		
        PreparedStatement ejecutar = null;
        
        
		
        try {
        	
        	//abrirConexion = conn.abrir().createStatement();
        	ejecutar = conn.abrir().prepareStatement(armarQuery);
        	
        	// preparedStatement = dbConnection.prepareStatement(insertTableSQL);

        	ejecutar.setString(1, prenda.getCodigo());
        	ejecutar.setString(2, prenda.getDescripcion());
        	ejecutar.setString(3, prenda.getPrecio());
        	ejecutar.setString(4, prenda.getNombre());
        	ejecutar.setInt(5, prenda.getClasificacion());

             // execute insert SQL stetement
        	ejecutar.executeUpdate();
        	
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print(e.getMessage().toString());
			throw e;
		}
       
        
		return prenda;
		
	}
	
	
	public Prendas Update(Prendas prenda)throws Exception {
			
		
		
		String armarQuery = "update prendas set Codigo = ? , Descripcion = ? , Precio = ? , Nombre = ? , Clasificacion = ? where id = ? ";
               
		

        //Statement abrirConexion = null;
		
        PreparedStatement ejecutar = null;

		
        try {
        	
        	//abrirConexion = conn.abrir().createStatement();
        	ejecutar = conn.abrir().prepareStatement(armarQuery);
        	
        	// preparedStatement = dbConnection.prepareStatement(insertTableSQL);

        	ejecutar.setString(1, prenda.getCodigo());
        	ejecutar.setString(2, prenda.getDescripcion());
        	ejecutar.setString(3, prenda.getPrecio());
        	ejecutar.setString(4, prenda.getNombre());
        	ejecutar.setInt(5, prenda.getClasificacion());
        	ejecutar.setInt(6, prenda.getId());

             // execute insert SQL stetement
        	ejecutar.executeUpdate();
        	
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print(e.getMessage().toString());
			throw e;
		}
       
        
		return prenda;
		
	}
	
public Prendas Delete(Prendas prenda)throws Exception {
			
		
		
		String armarQuery = "delete from prendas where id = ? " +";";
               
		

        //Statement abrirConexion = null;
		
        PreparedStatement ejecutar = null;

		
        try {
        	
        	//abrirConexion = conn.abrir().createStatement();
        	ejecutar = conn.abrir().prepareStatement(armarQuery);
        	
        	// preparedStatement = dbConnection.prepareStatement(insertTableSQL);

        
        	ejecutar.setInt(1, prenda.getId());

             // execute insert SQL stetement
        	ejecutar.executeUpdate();
        	
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print(e.getMessage().toString());
			throw e;
		}
       
        
		return prenda;
		
	}
}
