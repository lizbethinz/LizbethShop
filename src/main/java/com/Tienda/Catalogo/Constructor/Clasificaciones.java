package com.Tienda.Catalogo.Constructor;



public class Clasificaciones {
	
	private int idClasificacion;
	private String nombreClasificacion;
	private String Descripcion;
	
	public int getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(int idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	public String getNombreClasificacion() {
		return nombreClasificacion;
	}

	public void setNombreClasificacion(String nombreClasificacion) {
		this.nombreClasificacion = nombreClasificacion;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	
	public Clasificaciones() {
		
	}
	public Clasificaciones(int idClasificacion, String nombreClasificacion, String descripcion) {
		super();
		this.idClasificacion = idClasificacion;
		this.nombreClasificacion = nombreClasificacion;
		Descripcion = descripcion;
	}
	

	/*public Clasificaciones(int idClasificacion, String nombreClasificacion, String Descripcion) {
		
	}*/
}
