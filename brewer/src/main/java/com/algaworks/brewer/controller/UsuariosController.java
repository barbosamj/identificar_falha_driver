package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


import com.algaworks.brewer.model.Usuario;

@Controller
public class UsuariosController {
	
	@RequestMapping("/usuarios/novo")
	public String novo(Usuario usuario) {
		return "usuario/CadastroUsuario";
	}
	
	/*
	@RequestMapping(value = "/clientes/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes atributes) {
		if (result.hasErrors()) {
			return novo(cerveja);
		}
		
		//Salvar no banco de dados
		atributes.addFlashAttribute("mensagem", "Cerveja Salvo com sucesso!");
		System.out.println(">>> sku: " + cerveja.getSku());
		System.out.println(">>> Nome: " + cerveja.getNome());
		System.out.println(">>> Descrição: " + cerveja.getDescricao());
		return "redirect:/cervejas/novo";
	}
	*/
}
