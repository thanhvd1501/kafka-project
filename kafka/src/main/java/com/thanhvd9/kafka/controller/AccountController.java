package com.thanhvd9.kafka.controller;

import com.thanhvd9.kafka.dto.AccountDTO;
import com.thanhvd9.kafka.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/new")
    public ResponseEntity<AccountDTO> create(@RequestBody AccountDTO accountDTO) {

        return ResponseEntity.ok(accountService.sendMessageToKafka(accountDTO));
    }
}
