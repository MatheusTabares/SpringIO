package br.com.matheus.drogaria.controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drogaria")
public class DrogariaControlador {
	
	@RequestMapping("/teste")
	public String teste( ) {
		return "Olá Mundo String";
	}
}
