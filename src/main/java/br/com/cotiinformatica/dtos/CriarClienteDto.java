package br.com.cotiinformatica.dtos;

import lombok.Data;
//Classe criada como modelo para fornecer os dados para API.
@Data
public class CriarClienteDto {

	private String nomeCliente;
	private String emailCliente;
	private String telefoneCliente;

}
