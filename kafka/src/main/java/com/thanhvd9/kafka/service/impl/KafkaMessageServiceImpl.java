package com.thanhvd9.kafka.service.impl;

import com.thanhvd9.kafka.dto.MessageDTO;
import com.thanhvd9.kafka.service.KafkaMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageServiceImpl implements KafkaMessageService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public KafkaMessageServiceImpl(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void sendMessage(String topicName, Object message) {
        kafkaTemplate.send(topicName, message);
    }
}
