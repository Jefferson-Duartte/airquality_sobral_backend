package com.jefferson.airquality_sobral.controller;

import com.jefferson.airquality_sobral.dto.Data;
import com.jefferson.airquality_sobral.dto.RequestDTO;
import com.jefferson.airquality_sobral.service.AirQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/air-quality")
public class AirQualityController {

    @Autowired
    private AirQualityService service;

    @GetMapping("/sobral")
    public ResponseEntity<RequestDTO> getDados(){
        return ResponseEntity.ok(service.getDados());
    }

}
