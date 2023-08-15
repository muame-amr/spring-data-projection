package com.example.springdataprojection.view;

import com.example.springdataprojection.model.Person;
import org.springframework.beans.factory.annotation.Value;

/**
 * Projection for {@link Person}
 */
public interface PersonView {
    String getFirstName();

    String getLastName();

    @Value("#{target.firstName + ' ' + target.lastName}")
    String getFullName();
}