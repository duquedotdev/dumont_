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

import dev.duque.dumont.daos.ProdutoDAO;
import dev.duque.dumont.models.Produto;
import dev.duque.dumont.models.TipoPreco;
import dev.duque.dumont.validation.ProdutoValidation;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(new ProdutoValidation());		
	}
	
	@Autowired
	private ProdutoDAO produtoDao;
	
	
	@RequestMapping("/form")
	public ModelAndView form() {
		
		ModelAndView modelAndView = new ModelAndView("produtos/form");
		modelAndView.addObject("tipos", TipoPreco.values());
		
		System.out.println("Entrando formulário de cadastro de produtos");
		return modelAndView;
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView grava(@Valid Produto produto, BindingResult result, RedirectAttributes redirectAttributes) {
		
		if (result.hasErrors()){
			return form();
		}
		
		produtoDao.gravar(produto);	
		ModelAndView modelAndView = new ModelAndView("redirect:produtos");
		redirectAttributes.addFlashAttribute("sucesso", "Produto cadastrado com sucesso!");
		return modelAndView;
		
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listar() {
		List<Produto> produtos = produtoDao.listar();
		ModelAndView modelAndView = new ModelAndView("produtos/lista");
		modelAndView.addObject("produtos",produtos);		
		return modelAndView;
				
	}

}
