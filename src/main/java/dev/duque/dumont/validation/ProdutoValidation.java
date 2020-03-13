package dev.duque.dumont.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import dev.duque.dumont.models.Produto;

public class ProdutoValidation implements Validator{
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Produto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "titulo", "field.required"); //Só funciona com String
		
		ValidationUtils.rejectIfEmpty(errors, "descricao", "field.required");
		
		Produto produto = (Produto) target;
		
		if (produto.getPaginas() <= 0) { // O número de páginas de um livro não pode ser menor que 0 
			
			errors.rejectValue("paginas", "field.required");
		
	}
		}

}
