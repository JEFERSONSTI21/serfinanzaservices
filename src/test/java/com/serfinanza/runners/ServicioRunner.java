package com.serfinanza.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/servicio.feature",
        glue = "com.serfinanza.definitions")
public class ServicioRunner {
}
