package com.example.springdataprojection.repository;

import com.example.springdataprojection.model.Address;
import com.example.springdataprojection.view.AddressView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<AddressView> getAddressByState(String state);
}
