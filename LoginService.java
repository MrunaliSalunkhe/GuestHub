package com.Guesthub.GuestHub.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Guesthub.GuestHub.model.Login;
@Service
public interface LoginService {
	public Login Saveregister(Login login);
	
	public List<Login>loginList();
}
