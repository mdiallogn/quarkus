package org.acme.getting.started.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.acme.getting.started.service.ProductService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/api/v1/product")
public class ProductController {

    private final ProductService productService = new ProductService();
    private final ObjectMapper mapper = new ObjectMapper();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/list")
    public String getProducts(){
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
             return mapper.writeValueAsString(productService.getProducts());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloEasyRestApi(){
        return "Hello Easy REST API";
    }
}
