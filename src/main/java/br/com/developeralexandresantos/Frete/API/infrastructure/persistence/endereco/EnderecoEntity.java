package br.com.developeralexandresantos.Frete.API.infrastructure.persistence.endereco;

import br.com.developeralexandresantos.Frete.API.infrastructure.persistence.remetente.RemetenteEntity;
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
    @OneToOne(mappedBy = "endereco")
    private RemetenteEntity remetente;

    public EnderecoEntity(String logradouro) {
        this.logradouro = logradouro;
    }

    public EnderecoEntity() {

    }
}
