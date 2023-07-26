package com.example.apirest.service;


import com.example.apirest.controller.OrdenarService;
import com.example.apirest.model.ArregloContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/ordenar")
public class OrdenarController {
    private final OrdenarService ordenarService;

    @Autowired
    public OrdenarController(OrdenarService ordenarService) {
        this.ordenarService = ordenarService;
    }

    @PostMapping
    public ResponseEntity<?> orderArray(@RequestBody ArregloContainer arregloContainer) {
        List<Object> arreglo = arregloContainer.getArreglo();

        return ordenarService.OrdenarArreglo(arreglo);
    }

}
