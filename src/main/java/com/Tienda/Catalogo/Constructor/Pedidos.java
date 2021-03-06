package com.Tienda.Catalogo.Constructor;

public class Pedidos {

	private int idPedido;
	private int idCliente; 
	private int CostoTotal;
	private int estatus; 
	
	
	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getCostoTotal() {
		return CostoTotal;
	}

	public void setCostoTotal(int costoTotal) {
		CostoTotal = costoTotal;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}


	public Pedidos() {
		
	}
	
	public Pedidos(int idPedido, int idCliente, int costoTotal, int estatus) {
		super();
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.CostoTotal = costoTotal;
		this.estatus = estatus;
	}

	
//	public Pedidos(int idPedido, int idCliente, int CostoTotal, int estatus) {
//		
//	}
}
