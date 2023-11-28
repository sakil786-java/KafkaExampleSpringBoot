package com.enduser.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerConfig {

    private Logger logger= LoggerFactory.getLogger(KafkaConsumerConfig.class);
    @KafkaListener(topics = AppConstant.LOCATION_UPDATE_TOPIC ,groupId = AppConstant.GROUP_ID)
    public void updatedLocation(String value)
    {
    this.logger.info(value);
    }

}
