package com.Tienda.Catalogo.Constructor;

public class Clientes {
	private int idCliente;
	private String nombre;
	private String Direccion;
	private String email;
	private String telefono;
	
	public Clientes() {
		
	}
	public Clientes(int idCliente, String nombre, String direccion, String email, String telefono) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.Direccion = direccion;
		this.email = email;
		this.telefono = telefono;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	

	/*public Clientes(int idCliente, String nombre, String Direccion, String email, String telefono) {
		
	}*/
}
