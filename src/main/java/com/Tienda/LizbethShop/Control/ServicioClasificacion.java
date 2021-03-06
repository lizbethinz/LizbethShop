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
import  com.Tienda.Catalogo.Constructor.Clasificaciones;
import com.Tienda.Vista.VClasificacion;


@RestController
public class ServicioClasificacion {

	
	@RequestMapping(value="/Clasificacion", method = RequestMethod.GET )
	public ResponseEntity<Object> GetClasificacion(@RequestBody Clasificaciones clasificacion) throws Exception{
		VClasificacion clasificacionV= new VClasificacion();
		String respuesta="";
		HttpStatus estatus=null;
		if(clasificacion.getIdClasificacion()!=0) {
			clasificacion = clasificacionV.consulta(clasificacion);
			respuesta= clasificacion.toString();
			estatus= HttpStatus.OK;
			
		}else {
			respuesta="Es unaclasificación no existente";
			estatus= HttpStatus.INTERNAL_SERVER_ERROR;
			//
		}
		return new ResponseEntity<>(respuesta , estatus); 
	}
}
