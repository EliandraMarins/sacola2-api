package me.dio.sacola2.repository;

import me.dio.sacola2.model.Sacola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SacolaRepository extends JpaRepository<Sacola, Long> {
}
