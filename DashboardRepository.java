package com.Guesthub.GuestHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Guesthub.GuestHub.model.Dashboard;
@Repository
public interface DashboardRepository extends JpaRepository<Dashboard , Integer>{

}
