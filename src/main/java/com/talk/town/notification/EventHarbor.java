package com.talk.town.notification;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Slf4j
@Component
@RequiredArgsConstructor
public class EventHarbor {
    @EventListener
    public void handleDisconnectedSession(SessionDisconnectEvent event) {

    }
}
