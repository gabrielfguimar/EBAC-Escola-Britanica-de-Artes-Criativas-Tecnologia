package com.gabriel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

    // Fator VI: O controller é totalmente stateless. 
    // Ele não armazena dados na memória local da aplicação.
    @GetMapping
    public List<Map<String, String>> getProducts() {
        return List.of(
            Map.of("id", "1", "name", "Bolas de Malabarismo Zeekio", "type", "Premium Beanbag"),
            Map.of("id", "2", "name", "Clavas K8", "type", "Circus Arts Equipment")
        );
    }
}