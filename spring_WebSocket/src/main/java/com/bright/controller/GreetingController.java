package com.bright.controller;

import com.bright.pojo.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author 徐亮亮
 * @since 2021/1/9
 */
@Controller
public class GreetingController {
    @MessageMapping("/hello")
    @SendTo("/topic/greeting")
    public Message greeting(Message message) {
        return message;
    }
}
