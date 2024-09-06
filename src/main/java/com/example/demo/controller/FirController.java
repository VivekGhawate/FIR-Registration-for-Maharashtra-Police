package com.example.demo.controller;

import com.example.demo.model.FirReport;
import com.example.demo.service.FirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirController {

    @Autowired
    private FirService firService;

    @GetMapping("/submitFir")
    public String showFirForm(Model model) {
        model.addAttribute("firReport", new FirReport());
        model.addAttribute("policeStations", new String[] {"Station A", "Station B", "Station C"});
        model.addAttribute("actOptions", new String[] {"IPC – 1860", "IPC – 373", "IPC – 353", "IPC – 420", "IPC – 302"});
        model.addAttribute("infoTypes", new String[] {"Public Informed", "Victim Informed", "Criminal Informed"});
        model.addAttribute("ranks", new String[] {"Constable", "Head Constable", "ASI", "PSI", "API", "PI"});
        return "submitFir";
    }

    @PostMapping("/submitFir")
    public String submitFir(FirReport firReport, Model model) {
        firReport.setFirNumber(generateFirNumber()); // Generate FIR Number
        firService.submitFirReport(firReport);
        model.addAttribute("successMessage", "FIR submitted successfully!");
        return "home";
    }

    @GetMapping("/view-firs")
    public String viewFirs(Model model) {
        model.addAttribute("firReports", firService.findAllFirReports());
        return "viewFirs";
    }

    @GetMapping("/firDetails")
    public String firDetails(@RequestParam("id") Long id, Model model) {
        FirReport firReport = firService.findFirReportById(id);
        model.addAttribute("firReport", firReport);
        return "firDetails";
    }

    private String generateFirNumber() {
        return "FIR" + System.currentTimeMillis();
    }

    @GetMapping("/editFir")
    public String showEditFirForm(@RequestParam("id") Long id, Model model) {
        FirReport firReport = firService.findFirReportById(id);
        model.addAttribute("firReport", firReport);
        model.addAttribute("policeStations", new String[]{"Station A", "Station B", "Station C"}); // Example stations
        model.addAttribute("actOptions", new String[]{"IPC – 1860", "IPC – 373", "IPC – 353", "IPC – 420", "IPC – 302"});
        model.addAttribute("infoTypes", new String[]{"Public Informed", "Victim Informed", "Criminal Informed"});
        model.addAttribute("ranks", new String[]{"Constable", "Head Constable", "ASI", "PSI", "API", "PI"});
        return "editFir"; // Maps to /templates/editFir.html
    }

    // Method to handle the form submission
    @PostMapping("/editFir")
    public String editFir(@ModelAttribute("firReport") FirReport firReport) {
        firService.save(firReport);  // Save the updated FIR report
        return "redirect:/view-firs"; // Redirect to the list of FIRs after editing
    }

}