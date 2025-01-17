package com.jefferson.airquality_sobral.service;

import com.jefferson.airquality_sobral.dto.RequestDTO;
import org.springframework.stereotype.Service;


@Service
public class AirQualityService {

    ConverteDadosImpl conversor = new ConverteDadosImpl();
    ConsultaAirVisualAPI api = new ConsultaAirVisualAPI();

    public RequestDTO getDados(){
        var data = conversor.converteDados(api.getDadosAPI(), RequestDTO.class);
        return data;
    }

}
