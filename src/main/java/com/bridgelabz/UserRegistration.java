package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String FIRST_NAME_PATTERN= ("^[A-Z]{1}\\w{2,}");
    public boolean validFirstName(String firstName){
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();


    }

}
