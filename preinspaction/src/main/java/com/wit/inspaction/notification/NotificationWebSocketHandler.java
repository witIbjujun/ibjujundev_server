package com.wit.inspaction.notification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@Component
public class NotificationWebSocketHandler extends TextWebSocketHandler {

    private static final Logger logger = LoggerFactory.getLogger(NotificationWebSocketHandler.class);
    private Set<WebSocketSession> sessions = new CopyOnWriteArraySet<>();

    
    
    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        sessions.add(session);
        logger.info("New session connected: " + session.getId());
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
        sessions.remove(session);
        logger.info("Session disconnected: " + session.getId());
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        String payload = message.getPayload();
        logger.info("Received message: " + payload);

        
        for (WebSocketSession session2 : sessions) {
            if (session2.isOpen()) {
                try {
                	logger.info("메세지호출 ::: " + session2.getId());
                	session2.sendMessage(message);
                } catch (Exception e) {
                    logger.error("Error sending message to session: " + session.getId(), e);
                }
            }
        }
        
    }
}
