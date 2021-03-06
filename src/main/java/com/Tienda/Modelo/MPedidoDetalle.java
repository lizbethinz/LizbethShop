package com.Tienda.Modelo;

import java.beans.Statement;
import java.sql.ResultSet;


import com.Tienda.Catalogo.Constructor.PedidosDetalle;
import com.Tienda.Persistencia.MysqlConnection;
import com.Tienda.Persistencia.PPedidoDetalle;

public class MPedidoDetalle {

MysqlConnection conn = new MysqlConnection();
	
	PPedidoDetalle pedidoDetalleP = new PPedidoDetalle();
	
	public PedidosDetalle Select(PedidosDetalle pedidodetalle)throws Exception {
		String armarQuery = "select * from pedidosdetalle where "+pedidoDetalleP.idPedidoDetalle+" =" +pedidodetalle.getIdPedidoDetalle();
        Statement abrirConexion = null;
        ResultSet ejecutar = null;
		
        try {
        	abrirConexion = (Statement) conn.abrir().createStatement();
        	ejecutar = ((java.sql.Statement) abrirConexion).executeQuery(armarQuery);
        	
        	while(ejecutar.next()) {
        		
        		pedidodetalle.setIdPedidoDetalle(ejecutar.getInt(pedidoDetalleP.idPedidoDetalle)) ;
        		pedidodetalle.setIdPedido(ejecutar.getInt(pedidoDetalleP.idPedido)) ;
        		pedidodetalle.setIdArticulo(ejecutar.getInt(pedidoDetalleP.idArticulo)) ;
        		pedidodetalle.setTotal(ejecutar.getString(pedidoDetalleP.total)) ;
        		
        	}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print(e.getMessage().toString());
			throw e;
		}
       
        
		return pedidodetalle;
		
	}


}
