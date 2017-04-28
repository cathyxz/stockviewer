package com.cathyxz.stockviewer;

import com.cathyxz.stockviewer.resources.StocksResource;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StockViewerApplication extends Application<StockViewerConfiguration> {

    public static final Logger LOGGER = LoggerFactory.getLogger(StockViewerApplication.class);

    public static void main(final String[] args) throws Exception {
        new StockViewerApplication().run(args);
    }

    @Override
    public void run(final StockViewerConfiguration configuration, final Environment environment)
            throws Exception {

//        final DBIFactory factory = new DBIFactory();
//        final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "postgresql");

        final StocksResource stocksResource = new StocksResource();

        environment.jersey().register(stocksResource);
        environment.healthChecks().register("StockViewer", new StockViewerHealthCheck());

        LOGGER.info("Application name: {}", configuration.getAppName());
    }
}