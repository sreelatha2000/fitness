package com.healthservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthservice.entity.MedicalHistory;

@Repository
public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Long> {



}
