package br.com.juliano.domain.etinerario;

import java.io.Serializable;

import br.com.juliano.domain.pessoal.Motorista;
import br.com.juliano.domain.pessoal.Rodoviaria;
import br.com.juliano.domain.veiculo.Onibus;

/**
 * Classe que recebe os dados de Rota.
 * 
 * @author Juliano Roque Vieira
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public class Rota implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private Rodoviaria origem;

	private Rodoviaria destino;

	private Double quilometragem;

	private Double precoPassagem;

	private Onibus onibus;

	private Motorista motorista;

	/**
	 * 
	 */
	public Rota() {
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
	 * @return the origem
	 */
	public Rodoviaria getOrigem() {
		return origem;
	}

	/**
	 * @param origem the origem to set
	 */
	public void setOrigem(Rodoviaria origem) {
		this.origem = origem;
	}

	/**
	 * @return the destino
	 */
	public Rodoviaria getDestino() {
		return destino;
	}

	/**
	 * @param destino the destino to set
	 */
	public void setDestino(Rodoviaria destino) {
		this.destino = destino;
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
	 * @return the precoPassagem
	 */
	public Double getPrecoPassagem() {
		return precoPassagem;
	}

	/**
	 * @param precoPassagem the precoPassagem to set
	 */
	public void setPrecoPassagem(Double precoPassagem) {
		this.precoPassagem = precoPassagem;
	}

	/**
	 * @return the onibus
	 */
	public Onibus getOnibus() {
		return onibus;
	}

	/**
	 * @param onibus the onibus to set
	 */
	public void setOnibus(Onibus onibus) {
		this.onibus = onibus;
	}

	/**
	 * @return the motorista
	 */
	public Motorista getMotorista() {
		return motorista;
	}

	/**
	 * @param motorista the motorista to set
	 */
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destino == null) ? 0 : destino.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((motorista == null) ? 0 : motorista.hashCode());
		result = prime * result + ((onibus == null) ? 0 : onibus.hashCode());
		result = prime * result + ((origem == null) ? 0 : origem.hashCode());
		result = prime * result + ((precoPassagem == null) ? 0 : precoPassagem.hashCode());
		result = prime * result + ((quilometragem == null) ? 0 : quilometragem.hashCode());
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
		Rota other = (Rota) obj;
		if (destino == null) {
			if (other.destino != null)
				return false;
		} else if (!destino.equals(other.destino))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (motorista == null) {
			if (other.motorista != null)
				return false;
		} else if (!motorista.equals(other.motorista))
			return false;
		if (onibus == null) {
			if (other.onibus != null)
				return false;
		} else if (!onibus.equals(other.onibus))
			return false;
		if (origem == null) {
			if (other.origem != null)
				return false;
		} else if (!origem.equals(other.origem))
			return false;
		if (precoPassagem == null) {
			if (other.precoPassagem != null)
				return false;
		} else if (!precoPassagem.equals(other.precoPassagem))
			return false;
		if (quilometragem == null) {
			if (other.quilometragem != null)
				return false;
		} else if (!quilometragem.equals(other.quilometragem))
			return false;
		return true;
	}

}
