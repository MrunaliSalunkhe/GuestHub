package com.Guesthub.GuestHub.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Guesthub.GuestHub.model.Room;


@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}