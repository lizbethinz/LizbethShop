package com.Tienda.Vista;
import com.Tienda.Catalogo.Constructor.Prendas;
import com.Tienda.Modelo.*;


public class VPrenda {
	
	
	public Prendas consulta( Prendas prenda) throws Exception {
		
		MPrenda prendaM = new MPrenda();
		try {
			prenda = prendaM.Select(prenda);
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
		return prenda;
	}

}
