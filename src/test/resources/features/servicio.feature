#language: es

Característica: Consumo servicio

  Esquema del escenario:  Validacion servicios
    Dado se envia la primera peticion del servicio <rutaServicioRequest> <endpoint>
    Entonces se valida que el response sean iguales <rutaServicioResponse>

    Ejemplos:
  |rutaServicioRequest|rutaServicioResponse|endpoint|
  |/rest/request/ProductoDetalleApiGroup_DetalleCRO.json|/rest/response/ProductoDetalleApiGroup_DetalleCRO.json|baseURI|
  |/soap/request/OlimpiaServiceGroup_adicionarSolicitud.xml|/soap/response/OlimpiaServiceGroup_adicionarSolicitud.xml|baseURIV3|
 # |/soap/request/OlimpiaServiceGroup_adicionarSolicitud.xml|/soap/response/OlimpiaServiceGroup_adicionarSolicitud.xml|baseURIV3|
