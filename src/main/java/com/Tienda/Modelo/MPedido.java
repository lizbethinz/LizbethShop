package com.Tienda.Modelo;

//import java.beans.Statement;
import java.sql.*;
import java.sql.ResultSet;


import com.Tienda.Catalogo.Constructor.Pedidos;
import com.Tienda.Persistencia.MysqlConnection;
import com.Tienda.Persistencia.PPedido;

public class MPedido {
	
MysqlConnection conn = new MysqlConnection();
	
	PPedido pedidoP = new PPedido();
	
	public Pedidos Select(Pedidos pedido)throws Exception {
		String armarQuery = "select * from pedidos where "+pedidoP.idPedido+" =" +pedido.getIdPedido();
        Statement abrirConexion = null;
        ResultSet ejecutar = null;
		
        try {
        	abrirConexion = (Statement) conn.abrir().createStatement();
        	ejecutar = ((java.sql.Statement) abrirConexion).executeQuery(armarQuery);
        	
        	while(ejecutar.next()) {
        		pedido.setIdPedido(ejecutar.getInt(pedidoP.idPedido)) ;
        		pedido.setIdCliente(ejecutar.getInt(pedidoP.idCliente)) ;
        		pedido.setCostoTotal(ejecutar.getInt(pedidoP.CostoTotal)) ;
        		pedido.setEstatus(ejecutar.getInt(pedidoP.estatus)) ;
 

        	}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print(e.getMessage().toString());
			throw e;
		}
       
        
		return pedido;
		
	}


}
