package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    void whenFirstname_startsWithCapital() {
        UserRegistration userRegistration = new UserRegistration();
         boolean result= userRegistration.validFirstName("Shub");
        Assertions.assertTrue(result);
    }
}