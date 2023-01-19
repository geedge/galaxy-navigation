package com.galaxy.navigation.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "galaxy")
@PropertySource("classpath:application.properties")
@Component
public class GalaxyList {
    private java.util.List<PoolConfiguration> component;

    public static class PoolConfiguration {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public java.util.List<PoolConfiguration> getComponent() {
        return component;
    }

    public void setComponent(java.util.List<PoolConfiguration> component) {
        this.component = component;
    }
}