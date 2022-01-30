package br.com.smartpark.api.cadastro.controller;

import br.com.smartpark.api.cadastro.entity.PersonEntity;
import br.com.smartpark.api.cadastro.service.PersonService;
import lombok.RequiredArgsConstructor;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/cadastro/pessoa")
@RequiredArgsConstructor
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public class PersonController {

    private final PersonService service;

    @GET
    public PersonEntity getPerson() {
        return service.getPerson();
    }
}