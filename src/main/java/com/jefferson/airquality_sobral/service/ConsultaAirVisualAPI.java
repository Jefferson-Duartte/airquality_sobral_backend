package com.jefferson.airquality_sobral.service;

public class ConsultaAirVisualAPI {
    private final String API_KEY = "&key=62f256ab-dd17-4fb1-8c2a-98a2a1b1f862";

    private final String API_URL = "http://api.airvisual.com/v2/nearest_city?lat=-3.6861100&lon=-40.3497200";

    private ConsumoAPI consumoAPI = new ConsumoAPI();

    public String getDadosAPI() {
        var json = consumoAPI.obterDados(API_URL + API_KEY);
        return json;
    }
}
