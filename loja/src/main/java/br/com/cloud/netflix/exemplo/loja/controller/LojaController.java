package br.com.cloud.netflix.exemplo.loja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cloud.netflix.exemplo.loja.domain.Loja;

@RestController
public class LojaController {

	private static List<Loja> lojas = new ArrayList<Loja>();

	public LojaController() {
		lojas.add(new Loja("123", "Loja A"));
		lojas.add(new Loja("456", "Loja B"));
	}

	@RequestMapping("/")
	public List<Loja> getLojas() {
		return lojas;
	}
}
