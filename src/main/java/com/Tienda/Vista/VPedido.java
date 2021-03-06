package com.Tienda.Vista;

import com.Tienda.Catalogo.Constructor.Pedidos;
import com.Tienda.Modelo.MPedido;

public class VPedido {
	
public Pedidos consulta( Pedidos pedido) throws Exception {
		
		MPedido PedidoM = new MPedido();
		try {
			pedido = PedidoM.Select(pedido);
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
		return pedido;
	}

}
