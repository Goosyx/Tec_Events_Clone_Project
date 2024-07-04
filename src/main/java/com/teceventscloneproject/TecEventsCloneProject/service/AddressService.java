package com.teceventscloneproject.TecEventsCloneProject.service;

import com.teceventscloneproject.TecEventsCloneProject.domain.address.Address;
import com.teceventscloneproject.TecEventsCloneProject.domain.event.Event;
import com.teceventscloneproject.TecEventsCloneProject.domain.event.EventRequestDTO;
import com.teceventscloneproject.TecEventsCloneProject.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address createAddress(EventRequestDTO data, Event event){
        Address address = new Address();
        address.setCity(data.city());
        address.setUf(data.state());
        address.setEvent(event);

        return addressRepository.save(address);
    }
}
