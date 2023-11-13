package br.com.developeralexandresantos.Frete.API.main;

import br.com.developeralexandresantos.Frete.API.application.gateways.RemetenteGateway;
import br.com.developeralexandresantos.Frete.API.application.usecases.remetente.CreateRemetenteInteractor;
import br.com.developeralexandresantos.Frete.API.application.usecases.remetente.ListRemetenteInteractor;
import br.com.developeralexandresantos.Frete.API.infrastructure.controllers.remetente.RemetenteDTOMapper;
import br.com.developeralexandresantos.Frete.API.infrastructure.gateways.remetente.RemetenteEntityMapper;
import br.com.developeralexandresantos.Frete.API.infrastructure.gateways.remetente.RemetenteRepositoryGateway;
import br.com.developeralexandresantos.Frete.API.infrastructure.persistence.remetente.RemetenteRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RemetenteConfig {

    @Bean
    CreateRemetenteInteractor createRemetenteCase(RemetenteGateway remetenteGateway){
        return new CreateRemetenteInteractor(remetenteGateway);
    }

    @Bean
    ListRemetenteInteractor listRemetenteInteractor(RemetenteGateway remetenteGateway) {
        return new ListRemetenteInteractor(remetenteGateway);
    }

    @Bean
    RemetenteGateway remetenteGateway (RemetenteRepository remetenteRepository, RemetenteEntityMapper mapper) {
        return new RemetenteRepositoryGateway(remetenteRepository, mapper);
    }

    @Bean
    RemetenteEntityMapper remetenteEntityMapper() {
        return new RemetenteEntityMapper();
    }

    @Bean
    RemetenteDTOMapper remetenteDTOMapper() {
        return new RemetenteDTOMapper();
    }

}
