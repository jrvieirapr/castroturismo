package br.com.juliano.domain.veiculo;

import java.io.Serializable;

/**
 * Classe que recebe os dados de Onibus.
 * 
 * @author Juliano Roque Vieira
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public class Onibus extends Veiculo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer poltrona;

	/**
	 * 
	 */
	public Onibus() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the poltrona
	 */
	public Integer getPoltrona() {
		return poltrona;
	}

	/**
	 * @param poltrona the poltrona to set
	 */
	public void setPoltrona(Integer poltrona) {
		this.poltrona = poltrona;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((poltrona == null) ? 0 : poltrona.hashCode());
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
		Onibus other = (Onibus) obj;
		if (poltrona == null) {
			if (other.poltrona != null)
				return false;
		} else if (!poltrona.equals(other.poltrona))
			return false;
		return true;
	}

}
