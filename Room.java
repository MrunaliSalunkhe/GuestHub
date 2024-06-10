package com.Guesthub.GuestHub.model;




import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "is_occupied", nullable = true)
    private Boolean isOccupied;
    
    private String type;
    private boolean isAc;
    private RoomStatus status;
    private String name;
    private int members;
    private String aadhar;
    private String requirements;
    private String checkin;
    private String checkout;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isAc() {
		return isAc;
	}
	public void setAc(boolean isAc) {
		this.isAc = isAc;
	}
	public RoomStatus getStatus() {
		return status;
	}
	public void setStatus(RoomStatus status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMembers() {
		return members;
	}
	public void setMembers(int members) {
		this.members = members;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getRequirements() {
		return requirements;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	public void setIsOccupied(Boolean isOccupied) {
	    this.isOccupied = isOccupied != null ? isOccupied : false; // Set default value if null
	}
	public Boolean getIsOccupied() {
		return isOccupied;
	}
	public void setCheckin(Date checkin2) {
		// TODO Auto-generated method stub
		
	}
	

	
    
}