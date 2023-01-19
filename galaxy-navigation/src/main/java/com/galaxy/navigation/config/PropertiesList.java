package com.galaxy.navigation.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

@ConfigurationProperties(prefix = "master")
@PropertySource("classpath:application.properties")
@Component
public class PropertiesList {

    private List<PoolConfiguration> arangodb;
    private List<PoolConfiguration> druid;
    private List<PoolConfiguration> flink;
    private List<PoolConfiguration> hadoop;
    private List<PoolConfiguration> hbase;
    private List<PoolConfiguration> kafka;
    private List<PoolConfiguration> nacos;
    private List<PoolConfiguration> spark;
    private List<PoolConfiguration> xxl_job;

    public static class PoolConfiguration {
        private String id;
        private String endpoint;

        private String name;

        public String getId() {

            return id;
        }

        public void setId(String id) {

            this.id = id;
        }

        public String getEndpoint() {
            return endpoint;
        }

        public void setEndpoint(String endpoint) {

            this.endpoint = endpoint;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "PoolConfiguration{" +
                    "id='" + id + '\'' +
                    ", endpoint='" + endpoint + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public String endpoint(String hbaseId) {
        if (CollectionUtils.isEmpty(hbase))
            return null;
        for (PoolConfiguration config : hbase) {
            if (config.getId().equals(hbaseId)) {
                return config.getEndpoint();
            }
        }
        return null;
    }

    public List<PoolConfiguration> getHbase() {
        return hbase;
    }

    public void setHbase(List<PoolConfiguration> hbase) {

        this.hbase = hbase;
    }

    public List<PoolConfiguration> getFlink() {
        return flink;
    }

    public void setFlink(List<PoolConfiguration> flink) {
        this.flink = flink;
    }

    public List<PoolConfiguration> getArangodb() {
        return arangodb;
    }

    public void setArangodb(List<PoolConfiguration> arangodb) {
        this.arangodb = arangodb;
    }

    public List<PoolConfiguration> getDruid() {
        return druid;
    }

    public void setDruid(List<PoolConfiguration> druid) {
        this.druid = druid;
    }

    public List<PoolConfiguration> getHadoop() {
        return hadoop;
    }

    public void setHadoop(List<PoolConfiguration> hadoop) {
        this.hadoop = hadoop;
    }

    public List<PoolConfiguration> getKafka() {
        return kafka;
    }

    public void setKafka(List<PoolConfiguration> kafka) {
        this.kafka = kafka;
    }

    public List<PoolConfiguration> getNacos() {
        return nacos;
    }

    public void setNacos(List<PoolConfiguration> nacos) {
        this.nacos = nacos;
    }

    public List<PoolConfiguration> getSpark() {
        return spark;
    }

    public void setSpark(List<PoolConfiguration> spark) {
        this.spark = spark;
    }

    public List<PoolConfiguration> getXxl_job() {
        return xxl_job;
    }

    public void setXxl_job(List<PoolConfiguration> xxl_job) {
        this.xxl_job = xxl_job;
    }
}