package com.serfinanza.utils;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class UtilidadServicios {

    private static final XmlMapper xmlMapper= (XmlMapper) new XmlMapper().setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);

    public static String serializarModelo(Object modelo) throws JsonProcessingException {
        return xmlMapper.writeValueAsString(modelo);
    }

    public static String organizarEstructuraXml(String xml){
        return xml.replace("&lt","<").replace("&lt",">");
    }
}

