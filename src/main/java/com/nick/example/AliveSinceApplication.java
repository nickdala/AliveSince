package com.nick.example;

import com.nick.example.resources.AliveSinceAppResource;
import com.nick.example.resources.AliveSinceResource;
import com.nick.example.health.TemplateHealthCheck;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;

import io.dropwizard.views.ViewBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import java.util.Map;

public class AliveSinceApplication extends Application<AliveSinceConfiguration> {

    @Override
    public String getName() {
        return "alive-since";
    }

    public static void main(String[] args) throws Exception {
        new AliveSinceApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<AliveSinceConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle<AliveSinceConfiguration>() {
            @Override
            public Map<String, Map<String, String>> getViewConfiguration(AliveSinceConfiguration config) {
                return config.getViewRendererConfiguration();
            }
        });
        bootstrap.addBundle(new AssetsBundle());
    }

    @Override
    public void run(AliveSinceConfiguration configuration, Environment environment) throws Exception {
        final AliveSinceResource aliveSinceResource = new AliveSinceResource(configuration.getDefaultBirthYear(),
                configuration.getDefaultBirthMonth(), configuration.getDefaultBirthDate());
        final AliveSinceAppResource aliveSinceAppResource = new AliveSinceAppResource();
        final TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());

        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(aliveSinceResource);
        environment.jersey().register(aliveSinceAppResource);
    }
}
