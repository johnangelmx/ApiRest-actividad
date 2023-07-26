package com.example.apirest.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.time.DayOfWeek;
import java.time.LocalDate;

@Service
public class FechaService {


    public ResponseEntity<?> fechaActual() {
        return ResponseEntity.ok().body("fechaActual: " + LocalDate.now());
    }

    public ResponseEntity<?> mesActual() {
        LocalDate fechaActual = LocalDate.now();
        int mes = fechaActual.getMonthValue();
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return ResponseEntity.ok().body("mesActual: " + meses[mes - 1]);
    }

    public ResponseEntity<?> diaActual() {
        LocalDate fechaActual = LocalDate.now();
        int dia = fechaActual.getDayOfMonth();
        return ResponseEntity.ok().body("diaActual: " + dia);
    }

    public ResponseEntity<?> diaActualDeSemana() {
        LocalDate fechaActual = LocalDate.now();
        DayOfWeek dia = fechaActual.getDayOfWeek();
        String diaSemana = (dia.toString() == "SUNDAY") ? "Domingo" :
                (dia.toString() == "MONDAY") ? "Lunes" :
                        (dia.toString() == "TUESDAY") ? "Martes" :
                                (dia.toString() == "WEDNESDAY") ? "Miércoles" :
                                        (dia.toString() == "THURSDAY") ? "Jueves" :
                                                (dia.toString() == "FRIDAY") ? "Viernes" :
                                                        (dia.toString() == "SATURDAY") ? "Sábado" :
                                                                "Día no válido";

        return ResponseEntity.ok().body("diaActual: " + diaSemana);
    }
}
