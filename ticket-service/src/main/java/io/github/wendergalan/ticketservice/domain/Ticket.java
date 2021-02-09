package io.github.wendergalan.ticketservice.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "tickets")
@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Ticket implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "id")
    private Integer id;

    @Column(name = "numero_premiado")
    private Integer numeroPremiado;

    @Column(name = "status")
    private String status;

    @Column(name = "id_produto")
    private Integer produto;
}
