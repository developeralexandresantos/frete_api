package br.com.developeralexandresantos.Frete.API.infrastructure.controllers;

import br.com.developeralexandresantos.Frete.API.domain.entity.Remetente;
public class RemetenteDTOMapper {

    CreateRemetenteResponse toResponse (Remetente remetente){
        return new CreateRemetenteResponse(remetente.nome(), remetente.endereco());
    }

    Remetente toRemetente (CreateRemetenteRequest request){
        return new Remetente(request.id(), request.nome(), request.endereco());
    };
}
