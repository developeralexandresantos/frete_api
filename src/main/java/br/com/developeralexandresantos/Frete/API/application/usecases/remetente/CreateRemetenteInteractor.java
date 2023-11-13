package br.com.developeralexandresantos.Frete.API.application.usecases.remetente;

import br.com.developeralexandresantos.Frete.API.application.gateways.RemetenteGateway;
import br.com.developeralexandresantos.Frete.API.domain.entity.Remetente;

public class CreateRemetenteInteractor {

    private RemetenteGateway remetenteGateway;

    public CreateRemetenteInteractor(RemetenteGateway remetenteGateway) {
        this.remetenteGateway = remetenteGateway;
    }

    public Remetente createRemetente(Remetente remetente){
        return remetenteGateway.createRemetente(remetente);
    }
}
