package com.talk.town.chat.message.model;

import com.talk.town.chat.message.enums.MessageType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public record ChatMessageDTO(String content, String sender, MessageType messageType) {
}
