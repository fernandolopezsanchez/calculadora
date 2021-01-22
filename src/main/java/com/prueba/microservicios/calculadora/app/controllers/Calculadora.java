package com.prueba.microservicios.calculadora.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class Calculadora {

	@GetMapping("/sumar")
	public Integer sumar(
			@RequestParam("operando1") Integer operando1, 
			@RequestParam("operando2") Integer operando2) {
		return operando1 + operando2;
	}

	@GetMapping("/restar")
	public Integer restar(
			@RequestParam("operando1") Integer operando1,
			@RequestParam("operando2") Integer operando2) {
		return operando1 - operando2;
	}

}
