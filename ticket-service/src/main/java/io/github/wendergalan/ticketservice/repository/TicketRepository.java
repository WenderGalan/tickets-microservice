package io.github.wendergalan.ticketservice.repository;

import io.github.wendergalan.ticketservice.domain.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {

    Ticket findTicketByNumeroPremiado(Integer numeroPremiado);

    Ticket findAllByProduto(Integer produto);
}
