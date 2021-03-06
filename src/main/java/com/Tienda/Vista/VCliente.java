package com.Tienda.Vista;

import com.Tienda.Catalogo.Constructor.Clientes;
import com.Tienda.Modelo.MCliente;

public class VCliente {

public Clientes consulta( Clientes cliente) throws Exception {
		
		MCliente ClienteM = new MCliente();
		try {
			cliente = ClienteM.Select(cliente);
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
		return cliente;
	}
}
