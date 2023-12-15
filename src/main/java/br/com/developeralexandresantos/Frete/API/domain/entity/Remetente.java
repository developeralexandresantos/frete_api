package br.com.developeralexandresantos.Frete.API.domain.entity;

import br.com.developeralexandresantos.Frete.API.infrastructure.persistence.endereco.EnderecoEntity;

public record Remetente (Long id, String nome, EnderecoEntity endereco){
}
