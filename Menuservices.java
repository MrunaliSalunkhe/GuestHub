package com.Guesthub.GuestHub.services;

import java.util.List;

import com.Guesthub.GuestHub.model.MenuItem;



public interface Menuservices {
    public MenuItem Saveregister(MenuItem menu);
	
	public List<MenuItem>Menulist();
}
