package com.ivson.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivson.spring.model.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long> {

}
