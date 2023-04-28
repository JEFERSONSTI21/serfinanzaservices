package com.serfinanza.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EstructuraServicios {

    SERVICIO_BASE("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wsc=\"http://pragma.co/WSChannelAdapter/\" xmlns:reg=\"http://ReglasPriorizacionIntegrationService\" xmlns:xsi=\"xsi\">\n" +
            "   <soapenv:Header/>\n" +
            "   <soapenv:Body>\n" +
            "      <wsc:execute>\n" +
            "         <request>\n" +
            "            <header>\n" +
            "               <systemId>?</systemId>\n" +
            "               <messageId>${=java.util.UUID.randomUUID()}</messageId>\n" +
            "               <!--Optional:-->\n" +
            "               <invokerDateTime>?</invokerDateTime>\n" +
            "               <!--Optional:-->\n" +
            "               <securityCredential>\n" +
            "                  <userName>?</userName>\n" +
            "                  <!--Optional:-->\n" +
            "                  <userToken>?</userToken>\n" +
            "               </securityCredential>\n" +
            "               <!--Optional:-->\n" +
            "               <destination>\n" +
            "                  <!--Optional:-->\n" +
            "                  <name>BusinessServiceGroup</name>\n" +
            "                  <!--Optional:-->\n" +
            "                  <namespace>http://www.serfinansa.co/business/internal/1.0</namespace>\n" +
            "                  <!--Optional:-->\n" +
            "                  <operation>modeloOtorgamientoValidacion</operation>\n" +
            "               </destination>\n" +
            "               <!--Optional:-->\n" +
            "               <classification>\n" +
            "                  <!--1 or more repetitions:-->\n" +
            "                  <classification>TEST</classification>\n" +
            "               </classification>\n" +
            "            </header>\n" +
            "            <body>\n" +
            "               <request>\n" +
            "                  <modeloOtorgamientoRequest>\n" +
            "                     <solicitudID>28071</solicitudID>\n" +
            "                     <participanteID>35180</participanteID>\n" +
            "                     <tipoActividad>PENSIONADO</tipoActividad>\n" +
            "                     <tarjetaPlata>false</tarjetaPlata>\n" +
            "                     <ciudad>CARTAGENA</ciudad>\n" +
            "                     <tasaVigente>0.023</tasaVigente>\n" +
            "                     <gastosFamiliares>550000</gastosFamiliares>\n" +
            "                     <cantidadBienesRaices>1</cantidadBienesRaices>\n" +
            "                     <centralAConsultar>CIFIN</centralAConsultar>\n" +
            "                     <validacionHabitoPago>\n" +
            "                        <decisionId>123</decisionId>\n" +
            "                        <motivoConsulta>1</motivoConsulta>\n" +
            "                        <codigoInformacion>1441</codigoInformacion>\n" +
            "                        <numeroIdentificacion>33111140</numeroIdentificacion>\n" +
            "                        <tipoIdentificacion>CC</tipoIdentificacion>\n" +
            "                        <primerApellido>ARNEDO</primerApellido>\n" +
            "                        <calificacionUltimoTrimestre>A</calificacionUltimoTrimestre>\n" +
            "\t\t\t\t    <calificacionVigente>A</calificacionVigente>\n" +
            "                        <peorCalificacionUltimosTresTrimestres>A</peorCalificacionUltimosTresTrimestres>\n" +
            "                     </validacionHabitoPago>\n" +
            "                     <PerfildelClienteReglasRequest>\n" +
            "                        <DecisionID>123</DecisionID>\n" +
            "                        <SMLMV>781242</SMLMV>\n" +
            "                        <clienteSolicitud>\n" +
            "                           <ClienteSolicitud>\n" +
            "                              <edad>78</edad>\n" +
            "                              <categoriaCiudadResidencia>C1</categoriaCiudadResidencia>\n" +
            "                              <estadoCivil>SOLTERO(A)</estadoCivil>\n" +
            "                              <profesion>NO APLICA</profesion>\n" +
            "                              <ocupacion>PENSIONADO</ocupacion>\n" +
            "                              <antiguedadOcupacion>5</antiguedadOcupacion>\n" +
            "                              <tipoVivienda>PROPIA</tipoVivienda>\n" +
            "                              <sexo>FEMENINO</sexo>\n" +
            "                              <personasACargo>0</personasACargo>\n" +
            "                              <cargo></cargo>\n" +
            "                              <ingresoMensual>1100000</ingresoMensual>\n" +
            "                              <ingresoEnSalariosMinimos>1.408</ingresoEnSalariosMinimos>\n" +
            "                              <otrosIngresos>0</otrosIngresos>\n" +
            "                              <tarjetaPlata>FALSE</tarjetaPlata>\n" +
            "                              <clienteNuevo>TRUE</clienteNuevo>\n" +
            "                              <cupoTCO>0</cupoTCO>\n" +
            "                              <antiguedadTCO>0</antiguedadTCO>\n" +
            "                              <tiempoFinTrabajoAnterior>0</tiempoFinTrabajoAnterior>\n" +
            "                           </ClienteSolicitud>\n" +
            "                        </clienteSolicitud>\n" +
            "                     </PerfildelClienteReglasRequest>\n" +
            "                     <producto>\n" +
            "                        <tipo>TARJETA DE CRÉDITO</tipo>\n" +
            "                        <tasa>1</tasa>\n" +
            "                        <plazo>12</plazo>\n" +
            "                        <monto>500000</monto>\n" +
            "                     </producto>\n" +
            "                     <vehiculo>\n" +
            "                        <marca></marca>\n" +
            "                        <modelo>0</modelo>\n" +
            "                     </vehiculo>\n" +
            "                     <cuotaFijaProductosTramite>1</cuotaFijaProductosTramite>\n" +
            "                  </modeloOtorgamientoRequest>\n" +
            "               </request>\n" +
            "            </body>\n" +
            "         </request>\n" +
            "      </wsc:execute>\n" +
            "   </soapenv:Body>\n" +
            "</soapenv:Envelope>"),
    SERVICIO_RESPONSE("<NS1:Envelope xmlns:NS1=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
            "  <NS1:Header>\n" +
            "    <NS2:responseHeaderOut xmlns:NS2=\"http://pragma.co/ents/common/BaseMessageFormat/V1\">\n" +
            "      <systemId>Prueba</systemId>\n" +
            "      <messageId>${=java.util.UUID.randomUUID()}</messageId>\n" +
            "      <responseStatus>\n" +
            "        <statusCode>SUCCESS</statusCode>\n" +
            "      </responseStatus>\n" +
            "      <destination>\n" +
            "        <name>ClientesServiceGroup</name>\n" +
            "        <namespace>http://www.serfinansa.co/clientes/external/1.0</namespace>\n" +
            "        <operation>notificarAcuse</operation>\n" +
            "      </destination>\n" +
            "    </NS2:responseHeaderOut>\n" +
            "  </NS1:Header>\n" +
            "  <NS1:Body>\n" +
            "    <NS2:NotificarAcuseResponse xmlns:NS2=\"http://serfinanza.NotificarAcuseBus/\">\n" +
            "      <CodigoRespuesta>E002</CodigoRespuesta>\n" +
            "      <DescripcionRespuesta>ID TRANSACC NO EXISTE EN FACT</DescripcionRespuesta>\n" +
            "    </NS2:NotificarAcuseResponse>\n" +
            "  </NS1:Body>\n" +
            "</NS1:Envelope>"),
    SERVICIO_RESPONSE_REST("{\"responseHeaderOut\": {\n" +
            "   \"Header\":    {\n" +
            "      \"systemId\": \"IntercomBank\",\n" +
            "      \"messageId\": \"4ecb8217-793a-4cbe-9bd6-7684c32b45ef\",\n" +
            "      \"invokerDateTime\": \"2020-09-14\",\n" +
            "      \"responseStatus\": {\"statusCode\": \"SUCCESS\"},\n" +
            "      \"destination\":       {\n" +
            "         \"name\": \"ProductosDetalleApiGroup\",\n" +
            "         \"namespace\": \"http://www.serfinansa.co/productodetalle/external/1.0\",\n" +
            "         \"operation\": \"detalleProductos\"\n" +
            "      }\n" +
            "   },\n" +
            "   \"Body\": {\"respuesta\":    {\n" +
            "      \"codigo\": \"00\",\n" +
            "      \"descripcion\": \"Transacción exitosa\",\n" +
            "      \"tarjeta\":       {\n" +
            "         \"referencia\": \"8036492207\",\n" +
            "         \"fechaEmision\": \"20201120\",\n" +
            "         \"fechalimitePago\": \"20210805\",\n" +
            "         \"pagoMinimo\": \"0.00\",\n" +
            "         \"pagominimoVencido\": \"0\",\n" +
            "         \"pagoTotal\": \"0\",\n" +
            "         \"disponibleTotal\": \"300000.00\",\n" +
            "         \"disponibleAvance\": \"300000.00\",\n" +
            "         \"estado\": \"Normal\"\n" +
            "      }\n" +
            "   }}\n" +
            "}}");

    private final String valor;
}

