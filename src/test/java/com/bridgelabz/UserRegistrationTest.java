package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    void whenFirstname_startsWithCapital() {
        UserRegistration userRegistration = new UserRegistration();
         boolean result= userRegistration.validFirstName("Sub");
        Assertions.assertTrue(result);
    }

    @Test
    void whenLastname_startsWithCapital() {
        UserRegistration userRegistration= new UserRegistration();
        boolean result= userRegistration.validLastName("Ban");
        Assertions.assertTrue(result);
    }
}