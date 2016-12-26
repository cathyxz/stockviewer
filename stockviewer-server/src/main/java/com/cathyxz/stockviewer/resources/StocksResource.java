package com.cathyxz.stockviewer.resources;

import javax.ws.rs.GET;
import javax.ws.rs.PATH;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cathyxz.stockviewer.models.Stock;


@Path("/stocks")
@Produces(MediaType.APPLICATION_JSON)
public class StocksResource {

    public StocksResource() {

    }

    @GET
    @Timed
    public Stock getStock() {
        return new Stock(90, "ABC", "Google", 2004, "Software", "IT");
    }
}


