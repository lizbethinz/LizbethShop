package com.Tienda.Vista;

import com.Tienda.Catalogo.Constructor.Clasificaciones;
import com.Tienda.Modelo.MClasificacion;


public class VClasificacion {
	
	public Clasificaciones consulta( Clasificaciones clasificacion) throws Exception {
		
		MClasificacion ClasificacionM = new MClasificacion();
		try {
			clasificacion = ClasificacionM.Select(clasificacion);
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
		return clasificacion;
	}

}
