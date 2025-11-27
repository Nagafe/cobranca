package edu.ifmt.cobranca.ifmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; // Importe este
import org.springframework.web.bind.annotation.RequestMethod; // Importe este

import edu.ifmt.cobranca.ifmt.model.Titulo;
import edu.ifmt.cobranca.ifmt.repository.Titulos;

@Controller//anotação controller do spring
@RequestMapping("/titulos")//trazendo o mapeamento/titulos  para todos o controller
public class TituloController {
	
	
	@Autowired // anotação que irá injetar dependência
	private Titulos titulos;
	
	@RequestMapping("/novo")
	public String novo() {
		return "CadastroTitulo";
	}

	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "redirect:/titulos/novo";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String salvar(Titulo titulo) {
		titulos.save(titulo);
		return "CadastroTitulo";
	}
}