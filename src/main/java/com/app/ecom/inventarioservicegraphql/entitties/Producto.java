package com.app.ecom.inventarioservicegraphql.entitties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Producto {

    @Id
    private String id;

    private String nombre;

    private double precio;

    private int cantidad;

    @ManyToOne
    private Categoria categoria;
}
