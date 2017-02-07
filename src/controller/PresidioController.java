package controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Presidio;
import model.PresidioDao;


@Controller
public class PresidioController {
	
	@RequestMapping("/exibirIncluirPresidio")
	public String exibirIncluirPresidio(){
		
		
		return "presidio/incluirPresidio";
		
	}
	
	
	@RequestMapping("incluirPresidio")
	public String incluirPresidio(Presidio presidio){
		
		PresidioDao dao = new PresidioDao();
		dao.inserir(presidio);
		
		return "presidio/incluirPresidioSucesso";
	}
	
	
	// ---------------------------------------------------------//
	
	@RequestMapping("listarPresidio")
	public String listarPresidio( Model model){
		
		PresidioDao dao = new PresidioDao();
		
		List<Presidio> listaPresidio = dao.listar();
		
		
		model.addAttribute("listaPresidio", listaPresidio);

		return "presidio/pesquisarPresidio";
		
		
	}
	

}
