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
	
	public Prendas registrar( Prendas prenda) throws Exception{
		MPrenda prendaM = new MPrenda();
		try {
			//if(consulta(prenda).getId() == 0) {
				prendaM.Insert(prenda);
			//}

			
		} catch (Exception e) {
			throw e;
		}
		
		return prenda;
		
	}
	
	public Prendas editar( Prendas prenda) throws Exception{
		MPrenda prendaM = new MPrenda();
		try {
			//if(consulta(prenda).getId() == 0) {
				prendaM.Update(prenda);
			//}

			
		} catch (Exception e) {
			throw e;
		}
		
		return prenda;
		
	}
	
	public Prendas borrar( Prendas prenda) throws Exception{
		MPrenda prendaM = new MPrenda();
		try {
			//if(consulta(prenda).getId() == 0) {
				prendaM.Delete(prenda);
			//}

			
		} catch (Exception e) {
			throw e;
		}
		
		return prenda;
		
	}

}
