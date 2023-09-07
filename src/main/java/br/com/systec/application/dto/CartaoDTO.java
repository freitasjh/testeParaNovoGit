package br.com.systec.application.dto;

import java.math.BigDecimal;

import br.com.systec.domain.BandeiraCartao;
import br.com.systec.domain.Cartao;

public class CartaoDTO {

	private String nome;
	private BandeiraCartao bandeira;
	private BigDecimal renda;
	private BigDecimal limiteMinimo;

	public Cartao toModel() {
		Cartao cartao = new Cartao(nome, bandeira, renda, limiteMinimo);
		return cartao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BandeiraCartao getBandeira() {
		return bandeira;
	}

	public void setBandeira(BandeiraCartao bandeira) {
		this.bandeira = bandeira;
	}

	public BigDecimal getRenda() {
		return renda;
	}

	public void setRenda(BigDecimal renda) {
		this.renda = renda;
	}

	public BigDecimal getLimiteMinimo() {
		return limiteMinimo;
	}

	public void setLimiteMinimo(BigDecimal limiteMinimo) {
		this.limiteMinimo = limiteMinimo;
	}

}
