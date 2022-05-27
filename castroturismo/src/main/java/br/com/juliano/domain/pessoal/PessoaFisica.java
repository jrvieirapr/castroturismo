package br.com.juliano.domain.pessoal;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe que recebe os dados de Pessoa Fisica.
 * @author Juliano Roque Vieira
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public class PessoaFisica extends Pessoa implements Serializable {
	
	private Integer xCPF;
	
	private Integer xRG;
	
	private String orgaoEmisso;
	
	private Date dataNascimento;

	/**
	 * 
	 */
	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the xCPF
	 */
	public Integer getxCPF() {
		return xCPF;
	}

	/**
	 * @param xCPF the xCPF to set
	 */
	public void setxCPF(Integer xCPF) {
		this.xCPF = xCPF;
	}

	/**
	 * @return the xRG
	 */
	public Integer getxRG() {
		return xRG;
	}

	/**
	 * @param xRG the xRG to set
	 */
	public void setxRG(Integer xRG) {
		this.xRG = xRG;
	}

	/**
	 * @return the orgaoEmisso
	 */
	public String getOrgaoEmisso() {
		return orgaoEmisso;
	}

	/**
	 * @param orgaoEmisso the orgaoEmisso to set
	 */
	public void setOrgaoEmisso(String orgaoEmisso) {
		this.orgaoEmisso = orgaoEmisso;
	}

	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((orgaoEmisso == null) ? 0 : orgaoEmisso.hashCode());
		result = prime * result + ((xCPF == null) ? 0 : xCPF.hashCode());
		result = prime * result + ((xRG == null) ? 0 : xRG.hashCode());
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
		PessoaFisica other = (PessoaFisica) obj;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (orgaoEmisso == null) {
			if (other.orgaoEmisso != null)
				return false;
		} else if (!orgaoEmisso.equals(other.orgaoEmisso))
			return false;
		if (xCPF == null) {
			if (other.xCPF != null)
				return false;
		} else if (!xCPF.equals(other.xCPF))
			return false;
		if (xRG == null) {
			if (other.xRG != null)
				return false;
		} else if (!xRG.equals(other.xRG))
			return false;
		return true;
	}
	
	 
	
	

}
