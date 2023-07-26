package com.example.apirest.service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdenarService {

    public ResponseEntity<?> OrdenarArreglo(List<Object> arreglo) {

        for (Object elemento : arreglo) {
            if (!(elemento instanceof Integer)) {
                return ResponseEntity.badRequest().body("El arreglo debe contener solo enteros.");
            }
        }

        if (arreglo.isEmpty()) {
            return ResponseEntity.badRequest().body("Arreglo vacio, favor de validar");
        }


        List<Integer> arregloEnteros = arreglo.stream().map(elemento -> (Integer) elemento).collect(Collectors.toList());
        Collections.sort(arregloEnteros);

        return ResponseEntity.ok().body(arregloEnteros);
    }
}
