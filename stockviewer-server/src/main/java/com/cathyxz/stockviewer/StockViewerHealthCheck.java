package com.cathyxz.stockviewer;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by cathyzhu on 4/27/17.
 */
public class StockViewerHealthCheck extends HealthCheck {

    public StockViewerHealthCheck() {
        super();
    }

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
