package br.com.cotiinformatica.entities;

import java.util.UUID;

import lombok.Data;
@Data //Anotation do lombok que cria na classe as característica de um javaBean
public class Cliente {
	
	private UUID id;
	private String nome;
	private String email;
	private String telefone;

}
