package io.github.wendergalan.produtoservice.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
public class Ticket implements Serializable {
    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    private Integer id;

    private Integer numeroPremiado;

    private String status;
}
