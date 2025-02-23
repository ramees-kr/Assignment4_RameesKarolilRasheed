package com.example.workshopregistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "workshop_registrations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkshopRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // Personal Information
    @NotBlank(message = "First Name is required")
    private String firstName;

    @NotBlank(message = "Last Name is required")
    private String lastName;

    private String companyOrInstitution;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "City is required")
    private String city;

    @NotBlank(message = "State/Province/Region is required")
    private String state;

    @NotBlank(message = "Country is required")
    private String country;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Phone Number is required")
    private String phoneNumber;

    // Lunch Preference
    @NotBlank(message = "Meal Preference is required")
    private String mealPreference;

    // Payment Method as a single String (Cash, Cheque, or Demand Draft)
    @NotBlank(message = "Payment Method is required")
    private String paymentMethod;

    // Optional Payment Details (for Cheque or Demand Draft)
    private String chequeOrDDNumber;
    private String bankName;
    private String payableAt;
}
