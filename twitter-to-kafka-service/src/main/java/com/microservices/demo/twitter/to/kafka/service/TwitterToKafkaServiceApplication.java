package com.microservices.demo.twitter.to.kafka.service;
import com.microservices.demo.twitter.to.kafka.service.config.TwitterToKafkaServiceConfigData;
import com.microservices.demo.twitter.to.kafka.service.runner.StreamRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import twitter4j.Logger;

import java.util.Arrays;


@SpringBootApplication
@EnableConfigurationProperties(TwitterToKafkaServiceConfigData.class)
@ComponentScan(basePackages="com.microservices.demo")
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    private static final Logger LOG = Logger.getLogger(TwitterToKafkaServiceApplication.class);
    private final TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;

    private final StreamRunner streamRunner;
    public TwitterToKafkaServiceApplication(TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData, StreamRunner streamRunner) {
        this.twitterToKafkaServiceConfigData = twitterToKafkaServiceConfigData;
        this.streamRunner = streamRunner;
    }

    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("App starts...");
        LOG.info(Arrays.toString(twitterToKafkaServiceConfigData.getTwitterKeywords().toArray(new String[] {})));
        LOG.info(twitterToKafkaServiceConfigData.getWelcomeMessage());
        streamRunner.start();

    }

}
