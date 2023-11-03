package br.com.developeralexandresantos.Frete.API.infrastructure.gateways;

import br.com.developeralexandresantos.Frete.API.domain.entity.Remetente;
import br.com.developeralexandresantos.Frete.API.infrastructure.persistence.RemetenteEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class RemetenteEntityMapper {

    RemetenteEntity toEntity(Remetente remetente) {
        return new RemetenteEntity(remetente.nome(), remetente.endereco());
    }

    public Remetente toDomainObj(RemetenteEntity domainObj) {
        return new Remetente(domainObj.getId(), domainObj.getNome(), domainObj.getEndereco());
    }

    public List<Remetente> listToDomainObj(Iterable<RemetenteEntity> list) {
        List<Remetente> novaLista = StreamSupport.stream(list.spliterator(),false).map(lista -> new Remetente(lista.getId(), lista.getNome(), lista.getEndereco())).collect(Collectors.toList());
        return novaLista;
    }
}
