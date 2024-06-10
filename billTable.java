package com.Guesthub.GuestHub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class billTable {
   @Id
   private int id;
   private int tableno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getTableno() {
	return tableno;
}
public void setTableno(int tableno) {
	this.tableno = tableno;
}
   
}
