package com.talk.town.chat.message.service;

import com.talk.town.chat.message.model.ChatMessageDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class ChatServiceImpl implements ChatService{
    @Override
    public ChatMessageDTO sendMessage(ChatMessageDTO chatMessage) {
        return null;
    }
}
