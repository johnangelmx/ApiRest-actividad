package com.example.apirest.controller;


import com.example.apirest.service.FechaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/fecha")
public class FechaController {

    private final FechaService fechaService;

    @Autowired
    public FechaController(FechaService fechaService) {
        this.fechaService = fechaService;
    }


    @GetMapping
    public ResponseEntity<?> actuallyDate() {
        return fechaService.fechaActual();
    }

    @GetMapping(path = "/mes")
    public ResponseEntity<?> actuallyMonth() {
        return fechaService.mesActual();
    }

    @GetMapping(path = "/dia")
    public ResponseEntity<?> actuallyDay() {
        return fechaService.diaActual();
    }

    @GetMapping(path = "/dia/semana")
    public ResponseEntity<?> actuallyDayOfWeek() {
        return fechaService.diaActualDeSemana();
    }

}
