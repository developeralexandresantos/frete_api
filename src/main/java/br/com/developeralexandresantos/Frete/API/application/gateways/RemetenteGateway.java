package br.com.developeralexandresantos.Frete.API.application.gateways;

import br.com.developeralexandresantos.Frete.API.domain.entity.Remetente;

import java.util.List;

public interface RemetenteGateway {
    Remetente createRemetente(Remetente remetente);
    List<Remetente> getAllRemetentes();
}
