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
import  com.Tienda.Catalogo.Constructor.Clientes;
import com.Tienda.Vista.VCliente;

@RestController
public class ServicioCliente {

	
	@RequestMapping(value="/Cliente", method = RequestMethod.GET )
	public ResponseEntity<Object> GetCliente(@RequestBody Clientes cliente) throws Exception{
		VCliente clienteV = new VCliente();
		String respuesta="";
		HttpStatus estatus=null;
		
		if(cliente.getIdCliente()!=0) {
			cliente=clienteV.consulta(cliente);
			
			respuesta=cliente.toString();
			estatus= HttpStatus.OK;
			
		}else {
			respuesta="Es un cliente no existente";
			estatus= HttpStatus.INTERNAL_SERVER_ERROR;
			//
		}
		return new ResponseEntity<>(respuesta , estatus); 
	}
}
