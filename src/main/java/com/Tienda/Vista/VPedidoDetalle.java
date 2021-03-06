package com.Tienda.Vista;


import com.Tienda.Catalogo.Constructor.PedidosDetalle;
import com.Tienda.Modelo.MPedidoDetalle;

public class VPedidoDetalle {

public PedidosDetalle consulta( PedidosDetalle pedidoDetalle) throws Exception {
		
		MPedidoDetalle PedidoDetalleM = new MPedidoDetalle();
		try {
			pedidoDetalle = PedidoDetalleM.Select(pedidoDetalle);
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
		return pedidoDetalle;
	}
}
