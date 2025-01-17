package com.jefferson.airquality_sobral.service;

public interface IConverteDados {
    <T> T converteDados(String json, Class<T> classe);
}
