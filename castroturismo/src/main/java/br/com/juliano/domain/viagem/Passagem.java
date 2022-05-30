package br.com.juliano.domain.viagem;

import java.io.Serializable;

import br.com.juliano.domain.itinerario.Rota;
import br.com.juliano.domain.pessoal.Passageiro;

/**
 * Classe que recebe os dados de Passagem.
 * 
 * @author Juliano Roque Vieira
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public class Passagem implements Serializable {

	private Integer id;

	private Integer numeroPassagem;

	private FormaPagamentoEnum formaPagamento;

	private Boolean possuiBagagem;

	private Integer numeroPoltrona;

	private Passageiro passageiro;

	private Rota rota;

	/**
	 * 
	 */
	public Passagem() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the numeroPassagem
	 */
	public Integer getNumeroPassagem() {
		return numeroPassagem;
	}

	/**
	 * @param numeroPassagem the numeroPassagem to set
	 */
	public void setNumeroPassagem(Integer numeroPassagem) {
		this.numeroPassagem = numeroPassagem;
	}

	/**
	 * @return the formaPagamento
	 */
	public FormaPagamentoEnum getFormaPagamento() {
		return formaPagamento;
	}

	/**
	 * @param formaPagamento the formaPagamento to set
	 */
	public void setFormaPagamento(FormaPagamentoEnum formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	/**
	 * @return the possuiBagagem
	 */
	public Boolean getPossuiBagagem() {
		return possuiBagagem;
	}

	/**
	 * @param possuiBagagem the possuiBagagem to set
	 */
	public void setPossuiBagagem(Boolean possuiBagagem) {
		this.possuiBagagem = possuiBagagem;
	}

	/**
	 * @return the numeroPoltrona
	 */
	public Integer getNumeroPoltrona() {
		return numeroPoltrona;
	}

	/**
	 * @param numeroPoltrona the numeroPoltrona to set
	 */
	public void setNumeroPoltrona(Integer numeroPoltrona) {
		this.numeroPoltrona = numeroPoltrona;
	}

	/**
	 * @return the passageiro
	 */
	public Passageiro getPassageiro() {
		return passageiro;
	}

	/**
	 * @param passageiro the passageiro to set
	 */
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	/**
	 * @return the rota
	 */
	public Rota getRota() {
		return rota;
	}

	/**
	 * @param rota the rota to set
	 */
	public void setRota(Rota rota) {
		this.rota = rota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((formaPagamento == null) ? 0 : formaPagamento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numeroPassagem == null) ? 0 : numeroPassagem.hashCode());
		result = prime * result + ((numeroPoltrona == null) ? 0 : numeroPoltrona.hashCode());
		result = prime * result + ((passageiro == null) ? 0 : passageiro.hashCode());
		result = prime * result + ((possuiBagagem == null) ? 0 : possuiBagagem.hashCode());
		result = prime * result + ((rota == null) ? 0 : rota.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passagem other = (Passagem) obj;
		if (formaPagamento != other.formaPagamento)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numeroPassagem == null) {
			if (other.numeroPassagem != null)
				return false;
		} else if (!numeroPassagem.equals(other.numeroPassagem))
			return false;
		if (numeroPoltrona == null) {
			if (other.numeroPoltrona != null)
				return false;
		} else if (!numeroPoltrona.equals(other.numeroPoltrona))
			return false;
		if (passageiro == null) {
			if (other.passageiro != null)
				return false;
		} else if (!passageiro.equals(other.passageiro))
			return false;
		if (possuiBagagem == null) {
			if (other.possuiBagagem != null)
				return false;
		} else if (!possuiBagagem.equals(other.possuiBagagem))
			return false;
		if (rota == null) {
			if (other.rota != null)
				return false;
		} else if (!rota.equals(other.rota))
			return false;
		return true;
	}

}
