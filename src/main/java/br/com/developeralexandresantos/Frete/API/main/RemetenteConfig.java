package br.com.developeralexandresantos.Frete.API.main;

import br.com.developeralexandresantos.Frete.API.application.gateways.RemetenteGateway;
import br.com.developeralexandresantos.Frete.API.application.usecases.CreateRemetenteInteractor;
import br.com.developeralexandresantos.Frete.API.infrastructure.controllers.RemetenteDTOMapper;
import br.com.developeralexandresantos.Frete.API.infrastructure.gateways.RemetenteEntityMapper;
import br.com.developeralexandresantos.Frete.API.infrastructure.gateways.RemetenteRepositoryGateway;
import br.com.developeralexandresantos.Frete.API.infrastructure.persistence.RemetenteRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RemetenteConfig {

    @Bean
    CreateRemetenteInteractor createRemetenteCase(RemetenteGateway remetenteGateway){
        return new CreateRemetenteInteractor(remetenteGateway);
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
