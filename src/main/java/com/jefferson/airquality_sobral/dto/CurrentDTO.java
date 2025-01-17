package com.jefferson.airquality_sobral.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CurrentDTO(
        @JsonAlias("pollution") PoluenteDTO poluente,
        @JsonAlias("weather") TempoDTO tempo
) {}
