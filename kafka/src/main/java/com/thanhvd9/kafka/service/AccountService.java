package com.thanhvd9.kafka.service;

import com.thanhvd9.kafka.dto.AccountDTO;

public interface AccountService {

    AccountDTO sendMessageToKafka(AccountDTO account);

}
