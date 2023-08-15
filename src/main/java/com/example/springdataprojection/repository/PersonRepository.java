package com.example.springdataprojection.repository;

import com.example.springdataprojection.dto.PersonDTO;
import com.example.springdataprojection.model.Person;
import com.example.springdataprojection.view.PersonView;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long> {
    PersonView findByLastName(String lastName);

    PersonDTO findByFirstName(String firstName);

    <T> T findByLastName(String lastName, Class<T> type);
}
