package com.cathyxz.stockviewer;

import com.cathyxz.stockviewer.resources.StocksResource;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Environment;
import org.eclipse.jetty.security.authentication.BasicAuthenticator;
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

        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "postgresql");
        final StockViewerPostgresBackend postgresBackend = jdbi.onDemand(StockViewerPostgresBackend.class);

        environment.jersey().register(new StocksResource(postgresBackend));
        environment.healthChecks().register("StockViewer", new StockViewerHealthCheck());
        environment.jersey().register(new BasicAuthProvider<User>(new BasicAuthenticator(),
                "SUPER SECRET STUFF"));

        LOGGER.info("Application name: {}", configuration.getAppName());
    }
}