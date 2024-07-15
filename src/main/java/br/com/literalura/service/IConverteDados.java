package br.com.literalura.service;

public interface IConverteDados {
    <T> T getData(String json, Class<T> classe);
}