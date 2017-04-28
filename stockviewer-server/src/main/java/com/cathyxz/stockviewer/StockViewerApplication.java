package com.cathyxz.stockviewer;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
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

        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, config.getDataSourceFactory(), "postgresql");
        final UserDAO dao = jdbi.onDemand(UserDAO.class);

        environment.jersey().register(new UserResource(dao));

        final StocksResource stocksResource = new StocksResource();

        environment.jersey().register(stocksResource);

        LOGGER.info("Application name: {}", configuration.getAppName());
    }
}