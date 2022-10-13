package me.dio.sacola2.repository;

import me.dio.sacola2.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
