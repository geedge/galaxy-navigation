package com.galaxy.navigation.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "file")
@PropertySource("classpath:application.properties")
@Component
public class FileList {
    private java.util.List<PoolConfiguration> component;

    public static class PoolConfiguration {

        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    public java.util.List<PoolConfiguration> getComponent() {
        return component;
    }

    public void setComponent(java.util.List<PoolConfiguration> component) {
        this.component = component;
    }
}