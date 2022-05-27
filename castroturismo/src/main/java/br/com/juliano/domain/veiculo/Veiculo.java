package br.com.juliano.domain.veiculo;

import java.io.Serializable;

/**
 * Classe abstrata que contem os dados do modelo Veiculo.
 * 
 * @author Juliano Roque Vieira
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public abstract class Veiculo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String placa;

	private Integer renavam;

	private Double quilometragem;

	private Boolean estaSegurado;

	private String apolice;

	private Integer numeroEixos;

	private CombustivelEnum combustivel;

	/**
	 * 
	 */
	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/**
	 * @return the renavam
	 */
	public Integer getRenavam() {
		return renavam;
	}

	/**
	 * @param renavam the renavam to set
	 */
	public void setRenavam(Integer renavam) {
		this.renavam = renavam;
	}

	/**
	 * @return the quilometragem
	 */
	public Double getQuilometragem() {
		return quilometragem;
	}

	/**
	 * @param quilometragem the quilometragem to set
	 */
	public void setQuilometragem(Double quilometragem) {
		this.quilometragem = quilometragem;
	}

	/**
	 * @return the estaSegurado
	 */
	public Boolean getEstaSegurado() {
		return estaSegurado;
	}

	/**
	 * @param estaSegurado the estaSegurado to set
	 */
	public void setEstaSegurado(Boolean estaSegurado) {
		this.estaSegurado = estaSegurado;
	}

	/**
	 * @return the apolice
	 */
	public String getApolice() {
		return apolice;
	}

	/**
	 * @param apolice the apolice to set
	 */
	public void setApolice(String apolice) {
		this.apolice = apolice;
	}

	/**
	 * @return the numeroEixos
	 */
	public Integer getNumeroEixos() {
		return numeroEixos;
	}

	/**
	 * @param numeroEixos the numeroEixos to set
	 */
	public void setNumeroEixos(Integer numeroEixos) {
		this.numeroEixos = numeroEixos;
	}

	/**
	 * @return the combustivel
	 */
	public CombustivelEnum getCombustivel() {
		return combustivel;
	}

	/**
	 * @param combustivel the combustivel to set
	 */
	public void setCombustivel(CombustivelEnum combustivel) {
		this.combustivel = combustivel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apolice == null) ? 0 : apolice.hashCode());
		result = prime * result + ((combustivel == null) ? 0 : combustivel.hashCode());
		result = prime * result + ((estaSegurado == null) ? 0 : estaSegurado.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numeroEixos == null) ? 0 : numeroEixos.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		result = prime * result + ((quilometragem == null) ? 0 : quilometragem.hashCode());
		result = prime * result + ((renavam == null) ? 0 : renavam.hashCode());
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
		Veiculo other = (Veiculo) obj;
		if (apolice == null) {
			if (other.apolice != null)
				return false;
		} else if (!apolice.equals(other.apolice))
			return false;
		if (combustivel != other.combustivel)
			return false;
		if (estaSegurado == null) {
			if (other.estaSegurado != null)
				return false;
		} else if (!estaSegurado.equals(other.estaSegurado))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numeroEixos == null) {
			if (other.numeroEixos != null)
				return false;
		} else if (!numeroEixos.equals(other.numeroEixos))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		if (quilometragem == null) {
			if (other.quilometragem != null)
				return false;
		} else if (!quilometragem.equals(other.quilometragem))
			return false;
		if (renavam == null) {
			if (other.renavam != null)
				return false;
		} else if (!renavam.equals(other.renavam))
			return false;
		return true;
	}

}
