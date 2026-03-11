package com.example.Actividad_1_FullStack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Actividad_1_FullStack.model.Producto;
import com.example.Actividad_1_FullStack.repository.ProductoRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/productos")
@Tag(name = "Productos", description = "API para la gestión de productos de ShopSmart")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @Operation(summary = "Obtener todos los productos")
    @GetMapping
    public List<Producto> obtenerProductos() {
        return productoRepository.findAll();
    }

    @Operation(summary = "Crear un nuevo producto")
    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoRepository.save(producto);
    }
}