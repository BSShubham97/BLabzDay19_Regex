package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String FIRST_NAME_PATTERN= ("^[A-Z]{1}[a-z]{2,}");
    private static final String LAST_NAME_PATTERN= ("^[A-Z]{1}[a-z]{2,}");
    private static final String EMAIL_PATTERN= ("[a-zA-Z]+[.]*[a-zA-Z]*[@][b][l][.][c][o][.]*[in]*");

    public boolean validFirstName(String firstName){
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    public boolean validLastName(String lastName){
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
    public boolean validEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
    }
