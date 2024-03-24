package com.talk.town.chat.message.model;

import com.talk.town.chat.user.model.UserJpa;
import lombok.*;
import jakarta.persistence.*;

@Data
@Entity
@Builder
@EqualsAndHashCode
@Table(name = "chat_message", schema = "talk_town")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatMessageJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String messageUuid;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_uuid")
    private UserJpa user;

}
