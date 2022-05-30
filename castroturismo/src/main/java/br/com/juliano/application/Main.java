package br.com.juliano.application;

import java.util.Date;

import br.com.juliano.domain.local.Cidade;
import br.com.juliano.domain.local.Estado;
import br.com.juliano.domain.local.Pais;
import br.com.juliano.domain.pessoal.Motorista;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pais
		Pais pais = new Pais();

		pais.setId(1);

		pais.setNome("Brasil");

		System.out.println(pais);

		Estado estado = new Estado();

		estado.setId(1);

		estado.setNome("Parana");

		estado.setPais(pais);

		System.out.println(estado);

		Estado sp = new Estado();
		sp.setId(2);
		sp.setNome("São Paulo");
		sp.setPais(pais);
		System.out.println(sp);

		// Cidade
		Cidade castro = new Cidade();

		castro.setId(1);

		castro.setNome("Castro");

		castro.setEstado(estado);

		Cidade itp = new Cidade();

		itp.setId(2);

		itp.setNome("Itapetininga");

		itp.setEstado(sp);

		// Pessoas
		Motorista motorista = new Motorista();

		motorista.setNome("Tubarão da 151");

		motorista.setTelefoneCelular("42 9999-0000");

		motorista.setEmail("tubarao151@castroturismo.com.br");

		motorista.setLogradouro("Rua Tal");

		motorista.setComplemento("Apt 01");

		motorista.setNumero("60b");

		motorista.setCidade(castro);

		motorista.setxCPF(123456789);

		motorista.setxRG(123465);

		motorista.setOrgaoEmisso("SSPR");

		Date dataNascimento = new Date();

		motorista.setDataNascimento(dataNascimento);

		motorista.setNumeroDeRegistro(1451);

		motorista.setEstaAtivo(true);

		motorista.setxCNH(145678989);

		motorista.setCategoriaCNH("AE");

		motorista.setEar(true);

	}

}
