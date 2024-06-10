package com.Guesthub.GuestHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Guesthub.GuestHub.model.billTable;
@Repository
public interface TableRepository extends JpaRepository<billTable, Long> {

}
