package com.thanhvd9.kafka.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum KafkaTopics {
    NOTIFICATION_TOPIC("notification"),

    STATISTIC_TOPIC("statistic");

    private String value;

}
