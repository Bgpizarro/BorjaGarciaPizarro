package indra.talentCamp.springBoot.controllers;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import indra.talentCamp.springBoot.dto.RegistrarAutomovilParams;
import indra.talentCamp.springBoot.dto.RegistrarAutomovilResult;
import indra.talentCamp.springBoot.models.Automovil;
import indra.talentCamp.springBoot.services.AutomovilService;;

@RestController
public class AutomovilController {

	@Autowired
	private AutomovilService service;
	
	@RequestMapping(value="/api/automovil", method=RequestMethod.POST)
	public RegistrarAutomovilResult registrarAutomovil(@RequestBody RegistrarAutomovilParams params) {
		try {
			//System.out.println();
			Logger logger=LogManager.getLogger(AutomovilController.class);
			logger.log(Level.INFO,"POST /api/automovil -- Body "+params);
			
			assert params.getMarca()!=null: "Debe ingresar la marca del automovil";
			assert params.getMatricula()!=null: "Debe ingresar la matricula del automovil";
			
			Automovil auto=new Automovil() {{
				setMarca(params.getMarca());
				setMatricula(params.getMatricula());
			}};
			
			this.service.registrarAutomovil(auto);
			
			return new RegistrarAutomovilResult(true,"Automovil Registrado Satisfactoriamente con ID"+auto.getId());
		} catch(Throwable ex) {
			return new RegistrarAutomovilResult(false,"Error Registrando Automovil" + ex.getMessage());
		}
	}
}
