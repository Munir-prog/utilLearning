package com.mprog.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.PrintWriter;
import java.util.Scanner;

@Service
@RequiredArgsConstructor
@Slf4j
public class ConversationService {

    private final MessageService messageService;
    private final IOService ioService;

    public void doConversation(){
        ioService.println(messageService.localize("conversation.hello"));
        ioService.print(messageService.localize("conversation.enter-numbers"));

        int x = ioService.nextInt();
        int y = ioService.nextInt();


        ioService.println(messageService.localize("conversation.arithmetic", x, y, x + y));
    }
}
