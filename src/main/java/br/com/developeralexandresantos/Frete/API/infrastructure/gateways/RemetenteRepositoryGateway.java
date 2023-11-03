package br.com.developeralexandresantos.Frete.API.infrastructure.gateways;

import br.com.developeralexandresantos.Frete.API.application.gateways.RemetenteGateway;
import br.com.developeralexandresantos.Frete.API.domain.entity.Remetente;
import br.com.developeralexandresantos.Frete.API.infrastructure.persistence.RemetenteEntity;
import br.com.developeralexandresantos.Frete.API.infrastructure.persistence.RemetenteRepository;

import java.util.List;

public class RemetenteRepositoryGateway implements RemetenteGateway {
    private final RemetenteRepository remetenteRepository;
    private final RemetenteEntityMapper mapper;

    public RemetenteRepositoryGateway(RemetenteRepository remetenteRepository, RemetenteEntityMapper mapper) {
        this.remetenteRepository = remetenteRepository;
        this.mapper = mapper;
    }

    @Override
    public Remetente createRemetente(Remetente remetenteDomain) {
        RemetenteEntity remetenteEntity = mapper.toEntity(remetenteDomain);
        Remetente savedRemetente = mapper.toDomainObj(remetenteRepository.save(remetenteEntity));
        return savedRemetente;
    }

    @Override
    public List<Remetente> getAllRemetentes() {
        Iterable<RemetenteEntity> list = remetenteRepository.findAll();
        return mapper.listToDomainObj(list);
    }
}
