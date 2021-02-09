package io.github.wendergalan.produtoservice.repository;

import io.github.wendergalan.produtoservice.domain.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
