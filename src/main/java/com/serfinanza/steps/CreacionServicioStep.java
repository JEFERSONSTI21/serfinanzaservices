package com.serfinanza.steps;

import com.serfinanza.services.ConsumoServicioCliente;
import io.restassured.internal.support.Prettifier;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.apache.commons.lang3.StringUtils;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class CreacionServicioStep {

    protected ValidatableResponse validatableResponse;
    Response response;
    String soapRespuestaAceNuevo= null;

    public Response consumirServicioSoap(String cuerpo, String urlBase) {
        String path ="";
        ConsumoServicioCliente consumoServicioCliente = new ConsumoServicioCliente();
        return consumoServicioCliente.ejecutarConsumoServicio(urlBase,path,cuerpo,"POST");
    }
    @Step
    public  void enviarSolicitudServicio(String url, String rutaServicio) {
        try {

            response = consumirServicioSoap(Files.readString(Paths.get(rutaServicio)),url);
            Prettifier prettifier = new Prettifier();
            soapRespuestaAceNuevo = prettifier.getPrettifiedBodyIfPossible(response, response.getBody());
            System.out.println("------------------------");
            System.out.println(soapRespuestaAceNuevo);

        }catch (Exception e){

            System.out.println(e.getCause());
        }

    }

    @Step
    public void validacionServicio(String rutaResponse){
        try {
            if(StringUtils.deleteWhitespace(soapRespuestaAceNuevo.trim()).equals(StringUtils.deleteWhitespace(Files.readString(Paths.get(rutaResponse)).trim()))){
                Serenity.recordReportData().asEvidence().withTitle("Resultado comparacion")
                        .andContents("El resultado fue existoso servicios IBM10 Es igual al del ACE 12" +"\n"
                                +"La respuesta fue "+"\n"
                                +soapRespuestaAceNuevo);

            }else if(response.getStatusCode()!=200){
                assertEquals(soapRespuestaAceNuevo.trim()+"\n",200,response.getStatusCode());
            }else {
                assertEquals(StringUtils.deleteWhitespace(Files.readString(Paths.get(rutaResponse)).trim()), StringUtils.deleteWhitespace(soapRespuestaAceNuevo.trim()));
            }

        }catch (Exception e) {
            System.out.println(e.getCause());
        }

    }
}
