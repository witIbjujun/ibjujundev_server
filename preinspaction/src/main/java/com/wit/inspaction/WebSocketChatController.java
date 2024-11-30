package com.wit.inspaction;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.wit.inspaction.chat.model.ChatDTO;

@Controller
public class WebSocketChatController {

    @MessageMapping("/send") // 클라이언트에서 메시지 발신 시 연결되는 경로
    @SendTo("/topic/messages") // 메시지를 구독자에게 송신할 경로
    public ChatDTO sendMessage(ChatDTO message) {
        return message; // 메시지를 그대로 반환해 구독자에게 전달
    }
}