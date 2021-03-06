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
import  com.Tienda.Catalogo.Constructor.Pedidos;

@RestController
public class ServicioPedido {
	
	@RequestMapping(value="/Pedido", method = RequestMethod.GET )
	public ResponseEntity<Object> GetPedido(@RequestBody Pedidos pedido){
		String respuesta="";
		HttpStatus estatus=null;
		int idpedido = pedido.getIdPedido();
		if(idpedido != 0) {
			respuesta= "Su número de pedido es: "+idpedido ;
			estatus= HttpStatus.OK;
			
		}else {
			respuesta="No se encontró el número de pedido";
			estatus= HttpStatus.INTERNAL_SERVER_ERROR;
			//
		}
		return new ResponseEntity<>(respuesta , estatus); 
	}
}
