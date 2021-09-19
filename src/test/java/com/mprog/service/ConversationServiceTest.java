package com.mprog.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.mockito.Mockito.*;

class ConversationServiceTest {

    ConversationService sut;

    MessageService messageService;

    IOService ioService;

    static Random randomInt;

    @BeforeAll
    static void setRandomInt(){
        randomInt = new Random();
    }
    @BeforeEach
    void setUp(){
        messageService = mock(MessageService.class);
        ioService = mock(IOService.class);
        sut = new ConversationService(messageService, ioService);
    }


    @Test
    void doConversation() {
        int x = randomInt.nextInt(), y = randomInt.nextInt(), res = x + y;
        when(ioService.nextInt()).thenReturn(x, y).thenThrow(new RuntimeException());
        when(messageService.localize("conversation.arithmetic", x, y, res))
                .thenReturn("success");


        sut.doConversation();


        verify(ioService, times(1)).println("success");
    }
}