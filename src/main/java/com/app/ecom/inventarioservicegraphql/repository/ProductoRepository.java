package com.app.ecom.inventarioservicegraphql.repository;

import com.app.ecom.inventarioservicegraphql.entitties.Categoria;
import com.app.ecom.inventarioservicegraphql.entitties.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, String> {
}
