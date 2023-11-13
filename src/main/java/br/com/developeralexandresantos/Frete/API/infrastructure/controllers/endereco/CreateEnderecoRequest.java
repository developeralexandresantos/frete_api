package br.com.developeralexandresantos.Frete.API.infrastructure.controllers.endereco;

public class CreateEnderecoRequest {

    private Long id;
    private String logradouro;

    public CreateEnderecoRequest(Long id, String logradouro) {
        this.id = id;
        this.logradouro = logradouro;
    }

    public CreateEnderecoRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}
