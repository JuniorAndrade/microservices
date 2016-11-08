package br.com.cloud.netflix.exemplo.cliente.domain;

import java.util.List;

public class Cliente {

	private String name;
	private List<String> lojas;

	public Cliente(String name, List<String> lojas) {
		super();
		this.name = name;
		this.lojas = lojas;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLojas() {
		return lojas;
	}

	public void setLojas(List<String> lojas) {
		this.lojas = lojas;
	}
}
