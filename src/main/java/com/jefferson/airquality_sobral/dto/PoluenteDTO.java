package com.jefferson.airquality_sobral.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PoluenteDTO(
        @JsonAlias("aqius") Integer aqi,
        @JsonAlias("mainus") String principalPoluente
) {}
