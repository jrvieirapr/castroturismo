package br.com.juliano.domain.pessoal;

import java.io.Serializable;

/**
 * Classe que recebe os dados de Motorista.
 * 
 * @author Juliano Roque Vieira
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public class Motorista extends Funcionario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer xCNH;

	private String categoriaCNH;

	private Boolean ear;

	/**
	 * 
	 */
	public Motorista() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the xCNH
	 */
	public Integer getxCNH() {
		return xCNH;
	}

	/**
	 * @param xCNH the xCNH to set
	 */
	public void setxCNH(Integer xCNH) {
		this.xCNH = xCNH;
	}

	/**
	 * @return the categoriaCNH
	 */
	public String getCategoriaCNH() {
		return categoriaCNH;
	}

	/**
	 * @param categoriaCNH the categoriaCNH to set
	 */
	public void setCategoriaCNH(String categoriaCNH) {
		this.categoriaCNH = categoriaCNH;
	}

	/**
	 * @return the ear
	 */
	public Boolean getEar() {
		return ear;
	}

	/**
	 * @param ear the ear to set
	 */
	public void setEar(Boolean ear) {
		this.ear = ear;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((categoriaCNH == null) ? 0 : categoriaCNH.hashCode());
		result = prime * result + ((ear == null) ? 0 : ear.hashCode());
		result = prime * result + ((xCNH == null) ? 0 : xCNH.hashCode());
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
		Motorista other = (Motorista) obj;
		if (categoriaCNH == null) {
			if (other.categoriaCNH != null)
				return false;
		} else if (!categoriaCNH.equals(other.categoriaCNH))
			return false;
		if (ear == null) {
			if (other.ear != null)
				return false;
		} else if (!ear.equals(other.ear))
			return false;
		if (xCNH == null) {
			if (other.xCNH != null)
				return false;
		} else if (!xCNH.equals(other.xCNH))
			return false;
		return true;
	}

}
