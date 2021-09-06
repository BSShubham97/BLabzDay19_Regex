package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
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
    @Test
    void whenEmailentered_accordingToSpecifications() {
        UserRegistration userRegistration= new UserRegistration();
        boolean result= userRegistration.validEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }
}