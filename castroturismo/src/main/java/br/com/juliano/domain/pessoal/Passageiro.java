package br.com.juliano.domain.pessoal;

import java.io.Serializable;

/**
 * Classe que recebe os dados de Passageiro.
 * 
 * @author Juliano Roque Vieira
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public class Passageiro extends PessoaFisica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer numeroCartao;

	private String vencimento;

	private Integer seguranca;

	/**
	 * 
	 */
	public Passageiro() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the numeroCartao
	 */
	public Integer getNumeroCartao() {
		return numeroCartao;
	}

	/**
	 * @param numeroCartao the numeroCartao to set
	 */
	public void setNumeroCartao(Integer numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	/**
	 * @return the vencimento
	 */
	public String getVencimento() {
		return vencimento;
	}

	/**
	 * @param vencimento the vencimento to set
	 */
	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	/**
	 * @return the seguranca
	 */
	public Integer getSeguranca() {
		return seguranca;
	}

	/**
	 * @param seguranca the seguranca to set
	 */
	public void setSeguranca(Integer seguranca) {
		this.seguranca = seguranca;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((numeroCartao == null) ? 0 : numeroCartao.hashCode());
		result = prime * result + ((seguranca == null) ? 0 : seguranca.hashCode());
		result = prime * result + ((vencimento == null) ? 0 : vencimento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passageiro other = (Passageiro) obj;
		if (numeroCartao == null) {
			if (other.numeroCartao != null)
				return false;
		} else if (!numeroCartao.equals(other.numeroCartao))
			return false;
		if (seguranca == null) {
			if (other.seguranca != null)
				return false;
		} else if (!seguranca.equals(other.seguranca))
			return false;
		if (vencimento == null) {
			if (other.vencimento != null)
				return false;
		} else if (!vencimento.equals(other.vencimento))
			return false;
		return true;
	}

}
