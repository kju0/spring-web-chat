package com.example.messagingstompwebsocket.controller;

import com.example.messagingstompwebsocket.model.ChatRoom;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ChatRoomController {

    private final List<ChatRoom> chatRooms = new ArrayList<>();

    public ChatRoomController() {
        // 기본 채팅방 추가
        chatRooms.add(new ChatRoom("General"));
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("chatRooms", chatRooms);
        return "index";
    }

    @PostMapping("/chatroom")
    public String createChatRoom(@RequestParam String name) {
        chatRooms.add(new ChatRoom(name));
        return "redirect:/";
    }

    @GetMapping("/chatroom/{id}")
    public String joinChatRoom(Model model, @PathVariable String id) {
        model.addAttribute("roomId", id);
        return "chatroom";
    }
}
