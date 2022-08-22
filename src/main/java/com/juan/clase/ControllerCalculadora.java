package com.juan.clase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class ControllerCalculadora {
	@Value("${app.trm}")
	private int trm;
	
	@GetMapping("/convertirPesosDolares/{a}")

	public CalcularTrm convertirPesosDolares(@PathVariable int a) {
		CalcularTrm p1= new CalcularTrm(trm, 1, a);
		return p1;
	}
	
	@GetMapping("/convertirDolaresPesos/{a}")

	public CalcularTrm convertirDolaresPesos(@PathVariable int a) {
		CalcularTrm p1= new CalcularTrm(trm, 0, a);
		return p1;
	}

//control shit o organiza el codigo de los import
	// control shi f orgainza el formato identar
}
