package com.skyscanner.hoen;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.skyscanner.hoen.resources.SearchResource;

public class HoenSearchApplication extends Application<HoenSearchConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HoenSearchApplication().run(args);
    }

    @Override
    public String getName() {
        return "HoenSearch";
    }

    @Override
    public void initialize(final Bootstrap<HoenSearchConfiguration> bootstrap) {
        // nothing needed here
    }

    @Override
    public void run(final HoenSearchConfiguration configuration,
                    final Environment environment) {

        environment.jersey().register(new SearchResource());

    }
}
