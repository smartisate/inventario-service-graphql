package com.app.ecom.inventarioservicegraphql.repository;

import com.app.ecom.inventarioservicegraphql.entitties.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
