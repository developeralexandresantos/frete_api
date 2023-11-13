package br.com.developeralexandresantos.Frete.API.infrastructure.persistence.remetente;

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
    private String endereco;

    public RemetenteEntity(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public RemetenteEntity() {

    }
}
