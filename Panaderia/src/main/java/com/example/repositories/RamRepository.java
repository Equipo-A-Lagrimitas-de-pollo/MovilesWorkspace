package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Ram;

public interface RamRepository extends JpaRepository<Ram, Long> {

}
