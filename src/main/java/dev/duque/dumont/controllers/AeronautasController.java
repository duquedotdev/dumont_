package dev.duque.dumont.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import dev.duque.dumont.daos.AeronautaDAO;
import dev.duque.dumont.models.Aeronauta;
import dev.duque.dumont.models.Escolaridade;
import dev.duque.dumont.models.Sexo;
import dev.duque.dumont.models.UnidadeFederativa;
import dev.duque.dumont.validation.ProdutoValidation;

@Controller
@RequestMapping("/aeronautas")
public class AeronautasController {
	
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		binder.addValidators(new ProdutoValidation());		
//	}
	
	@Autowired
	private AeronautaDAO aeronautaDao;
	
	
	@RequestMapping("/cadastroAeronauta")
	public ModelAndView form() {
		
		ModelAndView modelAndView = new ModelAndView("aeronautas/cadastroAeronauta");
		modelAndView.addObject("unidadeFederativa", UnidadeFederativa.values());
		modelAndView.addObject("sexo", Sexo.values());
		modelAndView.addObject("escolaridade", Escolaridade.values());
		return modelAndView;
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView grava(Aeronauta aeronauta, RedirectAttributes redirectAttributes) {
		
		aeronautaDao.salvarAeronauta(aeronauta);	
		ModelAndView modelAndView = new ModelAndView("redirect:aeronautas");
		redirectAttributes.addFlashAttribute("aeronautaCadastrado", "Aeronauto cadastrado com sucesso!");
		return modelAndView;
		
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listar() {
		List<Aeronauta> aeronautas = aeronautaDao.listarAeronautas();
		ModelAndView modelAndView = new ModelAndView("aeronautas/listaAeronautas");
		modelAndView.addObject("aeronautas",aeronautas);		
		return modelAndView;
				
	}

}
