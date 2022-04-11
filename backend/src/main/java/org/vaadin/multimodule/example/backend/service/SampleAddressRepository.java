package org.vaadin.multimodule.example.backend.service;

import java.util.UUID;

import org.vaadin.multimodule.example.backend.entity.SampleAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleAddressRepository extends JpaRepository<SampleAddress, UUID> {

}