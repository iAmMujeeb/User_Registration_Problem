package com.bridgelabz.userreg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean checkValidity(String value) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,8}$");
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = scanner.next();
        UserRegistration.checkValidity(firstName);
        if(UserRegistration.checkValidity(firstName))
            System.out.println("Valid");
        else
            System.out.println("Invalid");


    }
}
