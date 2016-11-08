package br.com.cloud.netflix.exemplo.cliente.controller;

import java.util.*;

import org.springframework.web.bind.annotation.*;

import br.com.cloud.netflix.exemplo.cliente.domain.Cliente;

@RestController
public class ClienteController {

	private static List<Cliente> clientes = new ArrayList<Cliente>();

	public ClienteController() {
		clientes.add(new Cliente("Pessoa A", Arrays.asList("123", "456")));
		clientes.add(new Cliente("Pessoa B", Arrays.asList("123")));
	}

	@RequestMapping("/")
	public List<Cliente> getClientes() {
		return clientes;
	}

	@RequestMapping("/lojas/{id}")
	public List<Cliente> getClientes(@PathVariable String id) {
		List<Cliente> clientesFiltrados = new LinkedList<Cliente>();

		for (Cliente cliente : clientes) {
			if (cliente.getLojas().contains(id)) {
				clientesFiltrados.add(cliente);
			}
		}

		return clientesFiltrados;
	}
}
