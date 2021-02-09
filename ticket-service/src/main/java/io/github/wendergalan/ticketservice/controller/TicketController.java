package io.github.wendergalan.ticketservice.controller;

import io.github.wendergalan.ticketservice.domain.Ticket;
import io.github.wendergalan.ticketservice.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TicketController {
    private final TicketRepository ticketRepository;

    @GetMapping("/ticket")
    public Iterable<Ticket> all() {
        return ticketRepository.findAll();
    }

    @GetMapping("/ticket/{numeroTicket}")
    public Ticket findByTicketId(@PathVariable("numeroTicket") Integer numeroTicket) {
        return ticketRepository.findTicketByNumeroPremiado(numeroTicket);
    }

    @GetMapping("/ticket/produto/{produto}")
    public Ticket findByTicketProduto(@PathVariable("produto") Integer produto) {
        return ticketRepository.findAllByProduto(produto);
    }
}
