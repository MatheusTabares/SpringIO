package br.com.matheus.drogaria.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.matheus.drogaria.dao.FabricanteDAO;
import br.com.matheus.drogaria.dominio.Fabricante;

@RestController
@RequestMapping("/fabricante")
public class FabricanteControlador {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Fabricante> listar() {
		FabricanteDAO dao = new FabricanteDAO();
		return dao.listar();
	}
}
