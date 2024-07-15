package com.apigateway.conta.conta.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.io.Serializable;

@Getter
@Setter
public class ContaDTO implements Serializable {
    private Long numeroConta;
    private Boolean aprovada;
    private Long idCliente;
    private Date dataCriacao;
    private double limite;
    private Long idGerente;
    private ClienteDTO cliente; // Adicionar referência ao ClienteDTO
}