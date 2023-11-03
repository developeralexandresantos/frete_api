package br.com.developeralexandresantos.Frete.API.infrastructure.controllers;

import br.com.developeralexandresantos.Frete.API.application.usecases.CreateRemetenteInteractor;
import br.com.developeralexandresantos.Frete.API.domain.entity.Remetente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remetentes")
public class RemetenteController {
    private final CreateRemetenteInteractor createRemetenteInteractor;
    private RemetenteDTOMapper mapper;

    public RemetenteController(CreateRemetenteInteractor createRemetenteInteractor, RemetenteDTOMapper mapper) {
        this.createRemetenteInteractor = createRemetenteInteractor;
        this.mapper = mapper;
    }

    @PostMapping
    CreateRemetenteResponse create(@RequestBody CreateRemetenteRequest request) {
        Remetente remetenteBusinessObj = mapper.toRemetente(request);
        return mapper.toResponse(createRemetenteInteractor.createRemetente(remetenteBusinessObj));
    }
}
