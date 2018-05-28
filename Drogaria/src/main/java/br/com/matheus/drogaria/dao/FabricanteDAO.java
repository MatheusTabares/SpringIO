package br.com.matheus.drogaria.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.matheus.drogaria.dominio.Fabricante;

public class FabricanteDAO {
	private static List<Fabricante> fabricantes;
	
	public FabricanteDAO() {
		fabricantes = new ArrayList<>();
		fabricantes.add(new Fabricante(1L, "Fabricante A"));
		fabricantes.add(new Fabricante(2L, "Fabricante B"));
		fabricantes.add(new Fabricante(3L, "Fabricante C"));
		fabricantes.add(new Fabricante(4L, "Fabricante D"));
		fabricantes.add(new Fabricante(5L, "Fabricante E"));
	}
	
	public List<Fabricante> listar() {
		return fabricantes;
	}
}
