package br.com.systec.domain;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cartao")
public class Cartao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "bandeira")
	@Enumerated(EnumType.STRING)
	private BandeiraCartao bandeira;
	@Column(name = "renda")
	private BigDecimal renda;
	@Column(name = "limite_minimo")
	private BigDecimal limiteMinimo;

	public Cartao() {
	}

	public Cartao(String nome, BandeiraCartao bandeira, BigDecimal renda, BigDecimal limiteMinimo) {
		this.nome = nome;
		this.bandeira = bandeira;
		this.renda = renda;
		this.limiteMinimo = limiteMinimo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public int hashCode() {
		return Objects.hash(bandeira, id, limiteMinimo, nome, renda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cartao other = (Cartao) obj;
		return bandeira == other.bandeira && Objects.equals(id, other.id)
				&& Objects.equals(limiteMinimo, other.limiteMinimo) && Objects.equals(nome, other.nome)
				&& Objects.equals(renda, other.renda);
	}

	@Override
	public String toString() {
		return "Cartao [id=" + id + ", nome=" + nome + ", bandeira=" + bandeira + ", renda=" + renda + ", limiteMinimo="
				+ limiteMinimo + "]";
	}

}
