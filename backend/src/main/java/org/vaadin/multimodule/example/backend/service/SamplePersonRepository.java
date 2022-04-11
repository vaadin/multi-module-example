package org.vaadin.multimodule.example.backend.service;

import java.util.UUID;

import org.vaadin.multimodule.example.backend.entity.SamplePerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, UUID> {

}