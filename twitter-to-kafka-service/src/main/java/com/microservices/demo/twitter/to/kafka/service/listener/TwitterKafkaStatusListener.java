package com.microservices.demo.twitter.to.kafka.service.listener;

import com.microservices.demo.twitter.to.kafka.service.TwitterToKafkaServiceApplication;
import org.springframework.stereotype.Component;
import twitter4j.Logger;
import twitter4j.StatusAdapter;
import twitter4j.Status;


@Component
public class TwitterKafkaStatusListener extends StatusAdapter {

    private static final Logger LOG = Logger.getLogger(TwitterKafkaStatusListener.class);
    @Override
    public void onStatus(Status status) {
        LOG.info("Twitter status with the text {}", status.getText());

    }
}
