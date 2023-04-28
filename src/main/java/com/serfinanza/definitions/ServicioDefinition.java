package com.serfinanza.definitions;

import com.serfinanza.services.ConsumoServicioCliente;
import com.serfinanza.steps.CreacionServicioStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class ServicioDefinition {

    ConsumoServicioCliente consumoServicioCliente = new ConsumoServicioCliente();

    @Steps
    CreacionServicioStep creacionServicioStep;
    String rutaArchivo= "src/main/java/com/serfinanza/models";
    @Dado("^se envia la primera peticion del servicio (.*) (.*)$")
    public void se_envia_la_primera_peticion_del_servicio(String ruta,String endPoint) throws IOException {
        String baseUri = consumoServicioCliente.getValorProperties(endPoint);
        System.out.println("URL=" +baseUri);
        creacionServicioStep.enviarSolicitudServicio( baseUri,rutaArchivo+ruta);
    }

    @Entonces("^se valida que el response sean iguales (.*)$")
    public void se_valida_que_el_response_sean_iguales(String rutaRespuesta) {
        creacionServicioStep.validacionServicio(rutaArchivo + rutaRespuesta);
    }
}

