package com.apigateway.cliente.cliente.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClienteDTO implements Serializable {
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private float salario;
    private EnderecoDTO endereco;
}