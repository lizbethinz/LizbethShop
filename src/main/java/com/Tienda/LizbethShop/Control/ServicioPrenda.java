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

import com.Tienda.Catalogo.Constructor.Prendas;
import com.Tienda.Vista.VPrenda;

//importar paquetes de servicio
import java.util.HashMap;
import java.util.Map;




@RestController
public class ServicioPrenda {

	
	@RequestMapping("/")
	public String index() {
		return "Hola Mundo";
	}
	@RequestMapping(value="/Prenda", method = RequestMethod.GET )
	public ResponseEntity<Object> GetPrenda(@RequestBody Prendas prenda) throws Exception{
		VPrenda prendaV= new VPrenda();
		
		
		String respuesta="";
		HttpStatus estatus=null;
		if(prenda.getId()!=0) {
			prenda = prendaV.consulta(prenda);
			respuesta= prenda.toString();
			estatus= HttpStatus.OK;
			//return new ResponseEntity<>("Es una prenda válida" , HttpStatus.OK);
		}else {
			respuesta="Es una prenda no existente";
			estatus= HttpStatus.INTERNAL_SERVER_ERROR;
			//return new ResponseEntity<>("Es una prenda no existente" , HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(respuesta , HttpStatus.OK); 
	}
	@RequestMapping(value="/Prenda", method = RequestMethod.POST )
	public  ResponseEntity<Object> PostPrenda (@RequestBody Prendas prenda) throws Exception{
		VPrenda prendaV= new VPrenda();
		 String respuesta ="";
		 
		 prenda = prendaV.registrar(prenda);
		
		return new ResponseEntity<>(prenda , HttpStatus.OK); 
	}
	
	
	@RequestMapping(value="/PrendaEditar", method = RequestMethod.POST )
	public  ResponseEntity<Object> EditarPrenda (@RequestBody Prendas prenda) throws Exception{
		VPrenda prendaV= new VPrenda();
		 String respuesta ="";
		 
		 Prendas prendaSeleccionada = prendaV.consulta(prenda);
		 if(prendaSeleccionada.id == 0 ) {
			 return new ResponseEntity<>("La prenda no existe por lo cual no se puede actualizar" , HttpStatus.OK); 
		 }
		 prenda = prendaV.editar(prenda);
		
		return new ResponseEntity<>(prenda , HttpStatus.OK); 
	}
	
	@RequestMapping(value="/PrendaBorrar", method = RequestMethod.POST )
	public  ResponseEntity<Object> BorrarPrenda (@RequestBody Prendas prenda) throws Exception{
		VPrenda prendaV= new VPrenda();
		 String respuesta ="";
		
		 prenda = prendaV.borrar(prenda);
		
		return new ResponseEntity<>(prenda , HttpStatus.OK); 
	}
	
}


