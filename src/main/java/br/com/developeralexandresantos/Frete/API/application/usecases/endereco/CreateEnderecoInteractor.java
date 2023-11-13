package br.com.developeralexandresantos.Frete.API.application.usecases.endereco;

import br.com.developeralexandresantos.Frete.API.application.gateways.EnderecoGateway;
import br.com.developeralexandresantos.Frete.API.domain.entity.Endereco;

public class CreateEnderecoInteractor {

    private final EnderecoGateway enderecoGateway;

    public CreateEnderecoInteractor(EnderecoGateway enderecoGateway) {
        this.enderecoGateway = enderecoGateway;
    }

    public Endereco createEndereco(Endereco endereco){
        return enderecoGateway.createEndereco(endereco);
    }
}
