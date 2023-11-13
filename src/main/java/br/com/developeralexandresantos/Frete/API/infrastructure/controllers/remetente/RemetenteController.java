package br.com.developeralexandresantos.Frete.API.infrastructure.controllers.remetente;

import br.com.developeralexandresantos.Frete.API.application.usecases.remetente.CreateRemetenteInteractor;
import br.com.developeralexandresantos.Frete.API.application.usecases.remetente.ListRemetenteInteractor;
import br.com.developeralexandresantos.Frete.API.domain.entity.Remetente;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class RemetenteController {
    private final CreateRemetenteInteractor createRemetenteInteractor;
    private final ListRemetenteInteractor listRemetenteInteractor;

    private RemetenteDTOMapper mapper;

    public RemetenteController(CreateRemetenteInteractor createRemetenteInteractor, ListRemetenteInteractor listRemetenteInteractor, RemetenteDTOMapper mapper) {
        this.createRemetenteInteractor = createRemetenteInteractor;
        this.listRemetenteInteractor = listRemetenteInteractor;
        this.mapper = mapper;
    }


    @MutationMapping()
    CreateRemetenteResponse createRemetente(@Argument CreateRemetenteRequest request) {
        Remetente remetenteBusinessObj = mapper.toRemetente(request);
        return mapper.toResponse(createRemetenteInteractor.createRemetente(remetenteBusinessObj));
    }

    @QueryMapping()
    List<ListaRemetenteResponse> getAllRemetentes() {
        return mapper.toListResponse(listRemetenteInteractor.getAllRemetentes());
    }
}
