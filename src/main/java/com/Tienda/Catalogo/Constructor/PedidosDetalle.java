package com.Tienda.Catalogo.Constructor;

public class PedidosDetalle {
	private int idPedidoDetalle; 
	private int idPedido;
	private int idArticulo; 
	private String total;
	
	public int getIdPedidoDetalle() {
		return idPedidoDetalle;
	}
	public void setIdPedidoDetalle(int idPedidoDetalle) {
		this.idPedidoDetalle = idPedidoDetalle;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	
	public PedidosDetalle() {
		
	}
	public PedidosDetalle(int idPedidoDetalle, int idPedido, int idArticulo, String total) {
		super();
		this.idPedidoDetalle = idPedidoDetalle;
		this.idPedido = idPedido;
		this.idArticulo = idArticulo;
		this.total = total;
	}

	
	
// public PedidosDetalle(int idPedidoDetalle, int idPedido, int idArticulo, String total) {
//	 
// }
}
