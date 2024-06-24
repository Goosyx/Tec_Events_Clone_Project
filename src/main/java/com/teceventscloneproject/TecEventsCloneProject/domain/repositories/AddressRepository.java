package com.teceventscloneproject.TecEventsCloneProject.domain.repositories;

import com.teceventscloneproject.TecEventsCloneProject.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
