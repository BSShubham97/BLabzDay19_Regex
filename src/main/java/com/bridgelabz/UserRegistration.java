package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String FIRST_NAME_PATTERN= ("^[A-Z]{1}[a-z]{2,}");
    private static final String LAST_NAME_PATTERN= ("^[A-Z]{1}[a-z]{2,}");
    private static final String EMAIL_PATTERN= ("[a-zA-Z]+[.]*[a-zA-Z]*[@][b][l][.][c][o][.]*[in]*");
    private static final String PHONE_PATTERN = ("[9][1](?:\\s|-)*[0-9]{10}");
    private static final String PASSWORD_PATTERN = ("(?=.*?[A-Z])(?=.*?[0-9])[a-zA-Z0-9]{8,}$");

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
    public boolean validPhoneNumber(String phonenumber) {
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        return pattern.matcher(phonenumber).matches();
    }
    public boolean validPassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }

}
