package com.thanhvd9.kafka.service;

import com.thanhvd9.kafka.dto.MessageDTO;

public interface KafkaMessageService {

    void sendMessage(final String topicName, final Object message);
}
