package br.com.juliano.domain.veiculo;

import java.io.Serializable;

/**
 * Classe que recebe os dados de Carro.
 * 
 * @author Juliano Roque Vieira
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public class Carro extends Veiculo implements Serializable {

	public SetorEnum setor;

	/**
	 * 
	 */
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the setor
	 */
	public SetorEnum getSetor() {
		return setor;
	}

	/**
	 * @param setor the setor to set
	 */
	public void setSetor(SetorEnum setor) {
		this.setor = setor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((setor == null) ? 0 : setor.hashCode());
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
		Carro other = (Carro) obj;
		if (setor != other.setor)
			return false;
		return true;
	}

}
