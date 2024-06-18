package com.example.messagingstompwebsocket;

import com.example.messagingstompwebsocket.model.ChatRoom;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MessagingStompWebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingStompWebsocketApplication.class, args);
	}

	@Bean
	public List<ChatRoom> chatRooms() {
		return new ArrayList<>();
	}
}
