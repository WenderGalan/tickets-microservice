package io.github.wendergalan.produtoservice.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "produtos")
@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Transient
    private Ticket ticket;
}
