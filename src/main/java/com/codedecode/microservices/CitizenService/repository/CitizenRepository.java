package com.codedecode.microservices.CitizenService.repository;

import com.codedecode.microservices.CitizenService.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepository extends JpaRepository<Citizen, Integer> {
}