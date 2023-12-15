package br.com.developeralexandresantos.Frete.API.infrastructure.controllers.remetente;

import br.com.developeralexandresantos.Frete.API.domain.entity.Remetente;
import br.com.developeralexandresantos.Frete.API.infrastructure.persistence.endereco.EnderecoEntity;
import java.util.List;
import java.util.stream.Collectors;

public class RemetenteDTOMapper {

    CreateRemetenteResponse toResponse(Remetente remetente) {
        return new CreateRemetenteResponse(remetente.nome(), remetente.endereco().getLogradouro());
    }

    Remetente toRemetente(CreateRemetenteRequest request) {
        return new Remetente(null, request.nome(), new EnderecoEntity(request.endereco()));
    }

    ;

    List<ListaRemetenteResponse> toListResponse(List<Remetente> remetentes) {
        List<ListaRemetenteResponse> novaLista = remetentes.stream().map(lista -> new ListaRemetenteResponse(lista.id(), lista.nome(), lista.endereco().getLogradouro())).collect(Collectors.toList());
        return novaLista;
    }
}
