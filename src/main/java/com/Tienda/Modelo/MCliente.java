package com.Tienda.Modelo;

import java.beans.Statement;
import java.sql.ResultSet;

import com.Tienda.Catalogo.Constructor.Clientes;
import com.Tienda.Persistencia.MysqlConnection;
import com.Tienda.Persistencia.PCliente;

public class MCliente {
MysqlConnection conn = new MysqlConnection();
	
	PCliente clienteP = new PCliente();
	
	public Clientes Select(Clientes cliente)throws Exception {
		String armarQuery = "select * from clientes where "+clienteP.idCliente+" =" +cliente.getIdCliente();
        Statement abrirConexion = null;
        ResultSet ejecutar = null;
		
        try {
        	abrirConexion = (Statement) conn.abrir().createStatement();
        	ejecutar = ((java.sql.Statement) abrirConexion).executeQuery(armarQuery);
        	
        	while(ejecutar.next()) {
        		cliente.setIdCliente(ejecutar.getInt(clienteP.idCliente)) ;
        		cliente.setNombre(ejecutar.getString(clienteP.nombre));
        		cliente.setDireccion(ejecutar.getString(clienteP.Direccion));
        		cliente.setEmail(ejecutar.getString(clienteP.email));
        		cliente.setTelefono(ejecutar.getString(clienteP.telefono));
        		

        	}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print(e.getMessage().toString());
			throw e;
		}
       
        
		return cliente;
		
	}

}
