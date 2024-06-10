package com.Guesthub.GuestHub.services;

import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Guesthub.GuestHub.model.BookingException;
import com.Guesthub.GuestHub.model.Room;
import com.Guesthub.GuestHub.model.RoomStatus;
import com.Guesthub.GuestHub.repository.RoomRepository;




@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public void saveRoom(Room room) {
        roomRepository.save(room);
    }

    public Room getRoomById(long id) {
        return roomRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid room Id:" + id));
    }

    public void updateRoom(long id, Room updatedRoom) {
        Room existingRoom = getRoomById(id);
        existingRoom.setType(updatedRoom.getType());
        existingRoom.setAc(updatedRoom.isAc());
        existingRoom.setStatus(updatedRoom.getStatus());
        roomRepository.save(existingRoom);
    }

    public void deleteRoom(long id) {
        roomRepository.deleteById(id);
    }

    public void bookRoom(long id, String name, int members, String aadhar, String requirements, String checkin, String checkout) throws BookingException {
        Room room = getRoomById(id);
        if (room.getStatus() == RoomStatus.BOOKED) {
            throw new BookingException("Room is already booked");
        }
        room.setStatus(RoomStatus.BOOKED);
        room.setName(name);
        room.setMembers(members);
        room.setAadhar(aadhar);
        room.setRequirements(requirements);
        room.setCheckin(checkin);
        room.setCheckout(checkout);
        roomRepository.save(room);
    }
    public void createRoom(String aadhar, Date checkin, Date checkout, boolean isAc, int members, String name, String requirements, String status, String type) {
        Room room = new Room();
        room.setAadhar(aadhar);
        room.setCheckin(checkin);
        room.setCheckout(checkout);
        room.setIsAc(isAc);
        room.setIsOccupied(false); // Set to false initially
        room.setMembers(members);
        room.setName(name);
        room.setRequirements(requirements);
        room.setStatus(status);
        room.setType(type);

        roomRepository.save(room);
        
        
}}