package com.javaguide.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.javaguide.springboot.payload.User;

@Service
public class JsonKafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
	
	@KafkaListener(topics = "javaguide_json", groupId = "mygroup")
	public void jsonconsume(User data) {
		LOGGER.info(String.format("Message Resecived -> %s", data.toString()));
	}
}
