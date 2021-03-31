package org.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.logging.Logger;

@Path("/weather-forecast")
public class WeatherForecast {

    private static final Logger LOG = Logger.getLogger(WeatherForecast.class.getName());

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        LOG.info("hello from WeatherForecast Resource!");

        return "Hello ";
    }
}