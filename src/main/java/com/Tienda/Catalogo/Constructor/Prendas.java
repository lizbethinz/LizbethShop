package com.Tienda.Catalogo.Constructor;

import lombok.Data;

@Data
public class Prendas {
//	@Override
//	public String toString() {
//		return "Prendas [id=" + id + ", codigo=" + codigo + ", descripcion=" + descripcion + ", nombre=" + nombre
//				+ ", Precio=" + Precio + ", clasificacion=" + clasificacion + "]";
//	}


	public int id;
	private String codigo;
	private String descripcion;
	private String nombre;
	private String Precio;
	private int clasificacion;
	
//	public String getCodigo() {
//		return codigo;
//	}
//
//	public void setCodigo(String codigo) {
//		this.codigo = codigo;
//	}
//
//	public String getDescripcion() {
//		return descripcion;
//	}
//
//	public void setDescripcion(String descripcion) {
//		this.descripcion = descripcion;
//	}
//
//	public String getNombre() {
//		return nombre;
//	}
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//	public String getPrecio() {
//		return Precio;
//	}
//
//	public void setPrecio(String precio) {
//		Precio = precio;
//	}
//
//	public int getClasificacion() {
//		return clasificacion;
//	}
//
//	public void setClasificacion(int clasificacion) {
//		this.clasificacion = clasificacion;
//	}
//	
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public Prendas() {
		
	}
	
	
	public Prendas(int id,String codigo, String descripcion, String nombre, String precio, int clasificacion) {
		super();
		this.id= id;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.nombre = nombre;
		Precio = precio;
		this.clasificacion = clasificacion;
	}
	

//	public Prendas(String codigo, String descripcion, String nombre,String Precio, int clasificacion){
//		
//	}
}
