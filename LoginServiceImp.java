package com.Guesthub.GuestHub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Guesthub.GuestHub.model.Login;
import com.Guesthub.GuestHub.repository.LoginRepository;
@Service
public class LoginServiceImp implements LoginService{
	@Autowired
	private LoginRepository loginrepo;
	@Override
	public Login Saveregister(Login login) {
		
		return loginrepo.save(login);
	}

	@Override
	public List<Login> loginList() {
		List<Login>LoginList = loginrepo.findAll();
        return loginrepo.findAll();
	}

}
