package br.com.juliano.domain.pessoal;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe que recebe os dados de Pessoa Juridica.
 * 
 * @author Juliano Roque Vieira
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public class PessoaJuridica extends Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String xCNPJ;

	private Integer inscricaoEstadual;

	private Date dataAbertura;

	/**
	 * 
	 */
	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the xCNPJ
	 */
	public String getxCNPJ() {
		return xCNPJ;
	}

	/**
	 * @param xCNPJ the xCNPJ to set
	 */
	public void setxCNPJ(String xCNPJ) {
		this.xCNPJ = xCNPJ;
	}

	/**
	 * @return the inscricaoEstadual
	 */
	public Integer getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	/**
	 * @param inscricaoEstadual the inscricaoEstadual to set
	 */
	public void setInscricaoEstadual(Integer inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	/**
	 * @return the dataAbertura
	 */
	public Date getDataAbertura() {
		return dataAbertura;
	}

	/**
	 * @param dataAbertura the dataAbertura to set
	 */
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dataAbertura == null) ? 0 : dataAbertura.hashCode());
		result = prime * result + ((inscricaoEstadual == null) ? 0 : inscricaoEstadual.hashCode());
		result = prime * result + ((xCNPJ == null) ? 0 : xCNPJ.hashCode());
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
		PessoaJuridica other = (PessoaJuridica) obj;
		if (dataAbertura == null) {
			if (other.dataAbertura != null)
				return false;
		} else if (!dataAbertura.equals(other.dataAbertura))
			return false;
		if (inscricaoEstadual == null) {
			if (other.inscricaoEstadual != null)
				return false;
		} else if (!inscricaoEstadual.equals(other.inscricaoEstadual))
			return false;
		if (xCNPJ == null) {
			if (other.xCNPJ != null)
				return false;
		} else if (!xCNPJ.equals(other.xCNPJ))
			return false;
		return true;
	}

}
