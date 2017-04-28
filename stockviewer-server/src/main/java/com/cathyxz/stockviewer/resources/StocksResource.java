package com.cathyxz.stockviewer.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cathyxz.stockviewer.StockViewerPostgresBackend;
import com.cathyxz.stockviewer.models.Stock;
import com.codahale.metrics.annotation.Timed;


@Path("/stocks")
@Produces(MediaType.APPLICATION_JSON)
public class StocksResource {

    final private StockViewerPostgresBackend backend;

    public StocksResource(StockViewerPostgresBackend backend) {
        this.backend = backend;
    }

    @GET
    @Timed
    public Stock getStock() {
        return new Stock(90, "ABC", "Google", 2004, "Software", "IT");
    }


}


