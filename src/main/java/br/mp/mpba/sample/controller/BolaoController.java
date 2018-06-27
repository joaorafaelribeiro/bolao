package br.mp.mpba.sample.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BolaoController {

	@GetMapping(path="/boloa")
	public String listar() {
		return "listar";
	}
}
