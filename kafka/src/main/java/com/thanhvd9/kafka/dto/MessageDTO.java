package com.thanhvd9.kafka.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MessageDTO {

    private String to;

    private String toName;

    private String subject;

    private String content;
}
