package br.com.developeralexandresantos.Frete.API.application.usecases;

import br.com.developeralexandresantos.Frete.API.application.gateways.RemetenteGateway;
import br.com.developeralexandresantos.Frete.API.domain.entity.Remetente;

import java.util.List;

public class ListRemetenteInteractor {

    private RemetenteGateway remetenteGateway;

    public ListRemetenteInteractor(RemetenteGateway remetenteGateway) {
        this.remetenteGateway = remetenteGateway;
    }

    public List<Remetente> getAllRemetentes(){
        return remetenteGateway.getAllRemetentes();
    }
}
