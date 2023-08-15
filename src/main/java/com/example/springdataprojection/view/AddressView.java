package com.example.springdataprojection.view;

import com.example.springdataprojection.model.Person;

/**
 * Projection for {@link com.example.springdataprojection.model.Address}
 */
public interface AddressView {
    String getZipCode();

    PersonView getPerson();
}