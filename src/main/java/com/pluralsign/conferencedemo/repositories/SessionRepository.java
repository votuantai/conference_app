package com.pluralsign.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsign.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {
    
}
