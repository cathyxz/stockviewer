package com.cathyxz.stockviewer;

import com.codahale.metrics.health.HealthCheck;

public class StockViewerHealthCheck extends HealthCheck {

    public StockViewerHealthCheck() {
        super();
    }

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
