package com.serfinanza.services;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Properties;


public class ConsumoServicioCliente {

     RequestSpecification requestSpecification;


   public ConsumoServicioCliente() {
        requestSpecification = SerenityRest.given();
    }

    public Response ejecutarConsumoServicio(String urlBase,String recurso, String cuerpoPeticion,String metodo){

        HashMap<String,Object> headers = new HashMap<>();
        /*headers.put("Content-Type","text/xml;charset=UTF-8");
        headers.put("SOAPAction","http://tempuri.org/SOAP.Demo.AddInteger");*/
        headers.put("Content-Type","text/xml;charset=UTF-8");
        RequestSpecification peticionEspecifica =
                requestSpecification.headers(headers)
                        .baseUri(urlBase)
                        .body(cuerpoPeticion);
        return realizarPeticion(Method.valueOf(metodo),recurso,peticionEspecifica).prettyPeek();
    }

    private static Response realizarPeticion(Method metodoHttp, String recurso, RequestSpecification precondicion){
        Response consumo;
        switch (metodoHttp){
            case POST:
                consumo = precondicion.when().post(recurso);
                break;
            case PUT:
                consumo = precondicion.when().post(recurso);
                break;
            default:
                throw new InvalidParameterException("Metodo HTTP no soportado:"+ metodoHttp);

        }
        return consumo;
    }

    public String getValorProperties(String variable) throws IOException {

        String result = "";
        InputStream inputStream = null;

        try {

            Properties prop = new Properties();
            String propFileName = "./config.properties";
            inputStream = new FileInputStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("Archivo de Propiedades '" + propFileName + "' no encontrado.");
            }

            result = prop.getProperty(variable);

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }

        return result;
    }

}

