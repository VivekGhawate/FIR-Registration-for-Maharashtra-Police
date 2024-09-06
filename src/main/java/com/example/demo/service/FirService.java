package com.example.demo.service;

import com.example.demo.model.FirReport;
import com.example.demo.repository.FirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirService {

    @Autowired
    private FirRepository firRepository;

    public void submitFirReport(FirReport firReport) {
        firRepository.save(firReport); // Save FIR Report to the database
    }

    public List<FirReport> findAllFirReports() {
        return firRepository.findAll(); // Retrieve all FIR Reports
    }

    public FirReport findFirReportById(Long id) {
        return firRepository.findById(id).orElse(null); // Find FIR Report by ID
    }

    public void save(FirReport firReport) {
        firRepository.save(firReport);
    }
}
