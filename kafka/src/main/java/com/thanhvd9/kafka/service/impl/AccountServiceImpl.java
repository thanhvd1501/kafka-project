package com.thanhvd9.kafka.service.impl;

import com.thanhvd9.kafka.dto.AccountDTO;
import com.thanhvd9.kafka.dto.MessageDTO;
import com.thanhvd9.kafka.dto.StatisticDTO;
import com.thanhvd9.kafka.service.AccountService;
import com.thanhvd9.kafka.service.KafkaMessageService;
import com.thanhvd9.kafka.util.KafkaTopics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private KafkaMessageService kafkaMessageService;

    @Override
    public AccountDTO sendMessageToKafka(AccountDTO accountDTO) {

        StatisticDTO statisticDTO = new StatisticDTO("Account " + accountDTO.getEmail() + " is created", new Date());

        MessageDTO message = MessageDTO.builder()
                .to(accountDTO.getEmail())
                .toName(accountDTO.getName())
                .subject("Welcome to my World")
                .content("First project about Kafka.")
                .build();

        kafkaMessageService.sendMessage(KafkaTopics.NOTIFICATION_TOPIC.getValue(), message);
        kafkaMessageService.sendMessage(KafkaTopics.STATISTIC_TOPIC.getValue(), statisticDTO);

        return accountDTO;
    }
}
