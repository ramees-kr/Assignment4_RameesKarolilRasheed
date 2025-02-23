package com.example.workshopregistration.repository;

import com.example.workshopregistration.model.WorkshopRegistration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkshopRegistrationRepository extends CrudRepository<WorkshopRegistration, Long> {
}
