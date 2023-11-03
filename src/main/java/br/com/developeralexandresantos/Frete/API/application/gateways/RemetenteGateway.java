package br.com.developeralexandresantos.Frete.API.application.gateways;

import br.com.developeralexandresantos.Frete.API.domain.entity.Remetente;

public interface RemetenteGateway {
    Remetente createRemetente(Remetente remetente);
}
