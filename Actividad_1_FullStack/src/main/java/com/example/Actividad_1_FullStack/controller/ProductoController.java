package com.example.Actividad_1_FullStack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Actividad_1_FullStack.model.Producto;
import com.example.Actividad_1_FullStack.repository.ProductoRepository;

@RestController
@RequestMapping("/productos") // Todas las rutas empezarán con /productos
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    // GET /productos: Retorna una lista de productos en formato JSON
    @GetMapping
    public List<Producto> obtenerProductos() {
        return productoRepository.findAll();
    }

    // POST /productos: Permite agregar un nuevo producto
    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        // Guarda el producto en MySQL y lo devuelve con su ID generado
        return productoRepository.save(producto);
    }
}
