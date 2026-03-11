package com.example.Actividad_1_FullStack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Actividad_1_FullStack.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Al extender JpaRepository, Spring Boot nos regala automáticamente
    // métodos como save(), findAll(), findById(), delete(), etc.
}
