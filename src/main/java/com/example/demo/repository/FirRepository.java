package com.example.demo.repository;

import com.example.demo.model.FirReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FirRepository extends JpaRepository<FirReport, Long> {
}
