package com.jefferson.airquality_sobral.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record TempoDTO(
        @JsonAlias("tp") Integer temperatura,
        @JsonAlias("pr") Integer pressao,
        @JsonAlias("hu") Integer umidade,
        @JsonAlias("ws") Double velocidadeVento,
        @JsonAlias("wd") Integer direcaoVento,
        @JsonAlias("ic") String icone
) {}
