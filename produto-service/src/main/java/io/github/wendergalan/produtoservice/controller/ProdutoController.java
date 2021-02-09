package io.github.wendergalan.produtoservice.controller;

import io.github.wendergalan.produtoservice.domain.Produto;
import io.github.wendergalan.produtoservice.repository.ProdutoRepository;
import io.github.wendergalan.produtoservice.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class ProdutoController {
    private final ProdutoRepository produtoRepository;
    private final TicketService ticketService;

    @GetMapping("/produto")
    public Iterable<Produto> all() {
        return produtoRepository.findAll();
    }

    @GetMapping("/produto/{produto}")
    public Produto findByAccountId(@PathVariable("produto") Integer produtoId) {
        Optional<Produto> produto = produtoRepository.findById(produtoId);
        if (produto.isPresent()) {
            produto.get().setTicket(ticketService.findByProduto(produtoId));
            return produto.get();
        }
        return null;
    }
}
