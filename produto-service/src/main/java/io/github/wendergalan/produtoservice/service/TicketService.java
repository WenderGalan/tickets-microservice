package io.github.wendergalan.produtoservice.service;

import io.github.wendergalan.produtoservice.domain.Ticket;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ticket-service")
public interface TicketService {

    @GetMapping("/ticket/produto/{produto}")
    Ticket findByProduto(@PathVariable("produto") Integer produto);

}
