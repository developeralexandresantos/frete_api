package br.com.developeralexandresantos.Frete.API.infrastructure.persistence.endereco;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ENDERECO")
public class EnderecoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logradouro;

    public EnderecoEntity(String logradouro) {
        this.logradouro = logradouro;
    }

    public EnderecoEntity() {

    }
}
