package br.com.developeralexandresantos.Frete.API.infrastructure.persistence.remetente;

import br.com.developeralexandresantos.Frete.API.infrastructure.persistence.endereco.EnderecoEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "REMETENTE")
public class RemetenteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private EnderecoEntity endereco;

    public RemetenteEntity(String nome, EnderecoEntity endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public RemetenteEntity() {

    }
}
