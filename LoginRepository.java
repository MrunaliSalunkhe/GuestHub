package com.Guesthub.GuestHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Guesthub.GuestHub.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{

}
