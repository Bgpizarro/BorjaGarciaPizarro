package indra.talentCamp.jpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import indra.talentCamp.jpa.dto.NuevoHeroeRequest;
import indra.talentCamp.jpa.services.SuperHeroeService;
import indra.talentCamp.jpa.models.*;

@RestController
public class SuperHeroeController {
	
	@Autowired
	private SuperHeroeService service;

	//GET /api/hero -->Me los lista todos
	@RequestMapping(value="/api/hero", method=RequestMethod.GET)
	public ResponseEntity<?> avengerAssemble(){
		try {
			List<SuperHeroe> avengers=this.service.obtenerListaAvengers();
			return new ResponseEntity<>(avengers,HttpStatus.OK);
	
		}catch(BusinessException ex) {
			return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
			
		}catch(Exception ex) {
			return new ResponseEntity<>(ex.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//POST /api/hero -->Agrego uno nuevo
	
	@RequestMapping(value="/api/hero",method=RequestMethod.POST)
	public ResponseEntity<?> nuevoHeroe(@RequestBody NuevoHeroeRequest request) {
		try {
			SuperHeroe avenger=new SuperHeroe(); 
				avenger.setNombreArtistico(request.getName());
				avenger.setSuperpoder(request.getPower());
			
			this.service.registrarAvenger(avenger);
			
			return new ResponseEntity<>("Heroe registrado en acuerdo de Sokovia", HttpStatus.OK);
			
		}catch(BusinessException ex) {
			return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
			//Sugerencia: En general error de validacion o negocio-->BadRequest
			//				Error en base de datos, memoria, etc-->500+
		}catch(Exception ex) {
			return new ResponseEntity<>(ex.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}
