package br.com.developeralexandresantos.Frete.API.application.gateways;

import br.com.developeralexandresantos.Frete.API.domain.entity.Endereco;

import java.util.List;

public interface EnderecoGateway {
    Endereco createEndereco(Endereco endereco);
    List<Endereco> getAllEnderecos();
}
