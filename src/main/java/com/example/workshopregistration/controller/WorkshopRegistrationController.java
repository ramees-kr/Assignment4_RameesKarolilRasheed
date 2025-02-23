package com.example.workshopregistration.controller;

import com.example.workshopregistration.model.WorkshopRegistration;
import com.example.workshopregistration.repository.WorkshopRegistrationRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WorkshopRegistrationController {

    @Autowired
    private WorkshopRegistrationRepository registrationRepository;

    // Display the registration form
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("workshopRegistration", new WorkshopRegistration());
        return "workshop_registration";
    }

    // Process the submitted form
    @PostMapping("/register")
    public String submitRegistration(@Valid WorkshopRegistration workshopRegistration,
                                     BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "workshop_registration";
        }
        registrationRepository.save(workshopRegistration);
        model.addAttribute("registrations", registrationRepository.findAll());
        return "registration_success";
    }
}
