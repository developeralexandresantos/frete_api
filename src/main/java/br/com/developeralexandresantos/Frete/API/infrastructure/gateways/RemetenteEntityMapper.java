package br.com.developeralexandresantos.Frete.API.infrastructure.gateways;

import br.com.developeralexandresantos.Frete.API.domain.entity.Remetente;
import br.com.developeralexandresantos.Frete.API.infrastructure.persistence.RemetenteEntity;

public class RemetenteEntityMapper {

    RemetenteEntity toEntity(Remetente remetente) {
        return new RemetenteEntity(remetente.nome(), remetente.endereco());
    }

    public Remetente toDomainObj(RemetenteEntity domainObj) {
        return new Remetente(domainObj.getId(), domainObj.getNome(), domainObj.getEndereco());
    }
}
