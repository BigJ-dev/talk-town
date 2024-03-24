package com.talk.town.chat.message.service;

import com.talk.town.chat.message.model.ChatMessageDTO;

public interface ChatService {
    ChatMessageDTO sendMessage(ChatMessageDTO chatMessage);
}
