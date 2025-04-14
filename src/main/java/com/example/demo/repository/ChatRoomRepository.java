package com.example.demo.repository;

import com.example.demo.model.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, String> {
Optional<ChatRoom> findBySenderIdAndReceiverId(String senderId, String receiverId);

}
