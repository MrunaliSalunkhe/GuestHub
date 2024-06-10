package com.Guesthub.GuestHub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dashboard {
	@Id
	private int id;
	private String Dashboard;
	private String Menu;
	private String Orderlist;
	private int TotalOrder;
	private String Team;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDashboard() {
		return Dashboard;
	}
	public void setDashboard(String dashboard) {
		Dashboard = dashboard;
	}
	public String getMenu() {
		return Menu;
	}
	public void setMenu(String menu) {
		Menu = menu;
	}
	public String getOrderlist() {
		return Orderlist;
	}
	public void setOrderlist(String orderlist) {
		Orderlist = orderlist;
	}
	public int getTotalOrder() {
		return TotalOrder;
	}
	public void setTotalOrder(int totalOrder) {
		TotalOrder = totalOrder;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	@Override
	public String toString() {
		return "Dashboard [id=" + id + ", Dashboard=" + Dashboard + ", Menu=" + Menu + ", Orderlist=" + Orderlist
				+ ", TotalOrder=" + TotalOrder + ", Team=" + Team + "]";
	}
	public Dashboard(int id, String dashboard, String menu, String orderlist, int totalOrder, String team) {
		super();
		this.id = id;
		Dashboard = dashboard;
		Menu = menu;
		Orderlist = orderlist;
		TotalOrder = totalOrder;
		Team = team;
	}
	public Dashboard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
