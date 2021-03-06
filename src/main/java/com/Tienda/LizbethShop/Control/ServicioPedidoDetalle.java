package com.Tienda.LizbethShop.Control;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;


//importar paquetes de servicio
import  com.Tienda.Catalogo.Constructor.PedidosDetalle;
import com.Tienda.Vista.VPedidoDetalle;

@RestController
public class ServicioPedidoDetalle {

	@RequestMapping(value="/PedidoDetalle", method = RequestMethod.GET )
	public ResponseEntity<Object> GetPedidoDetalle(@RequestBody PedidosDetalle pedidoDetalle) throws Exception{
		VPedidoDetalle pedidoDetalleV = new VPedidoDetalle();
		
		
		String respuesta="";
		HttpStatus estatus=null;
		int idpedido = pedidoDetalle.getIdPedido();
		int articuloPedido= pedidoDetalle.getIdArticulo();
		if(idpedido != 0) {
			pedidoDetalle = pedidoDetalleV.consulta(pedidoDetalle);
			respuesta= pedidoDetalle.toString() ;
			estatus= HttpStatus.OK;
			
		}else {
			respuesta="No se encontró el número de pedido";
			estatus= HttpStatus.INTERNAL_SERVER_ERROR;
			//
		}
		return new ResponseEntity<>(respuesta , estatus); 
	}

}
