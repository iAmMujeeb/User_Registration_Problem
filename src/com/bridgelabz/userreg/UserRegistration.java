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
        if (UserRegistration.checkValidity(firstName)) System.out.println("Valid");
        else System.out.println("Invalid");

        System.out.println("Enter Last Name");
        String lastName = scanner.next();
        UserRegistration.checkValidity(lastName);
        if (UserRegistration.checkValidity(lastName)) System.out.println("Valid");
        else System.out.println("Invalid");

        System.out.println("Enter Email ID");
        String emailId = scanner.next();
        Pattern pattern = Pattern.compile("^abc.[a-z]*@bl.co.[a-z]*$");
        Matcher matcher = pattern.matcher(emailId);
        if (matcher.matches())
            System.out.println("valid Email ID");
        else
            System.out.println("Invalid Email ID");

        Pattern pattern1 = Pattern.compile("^[+]91[0-9]{10}$");
        Matcher matcher2 = pattern1.matcher("+917025862800");
        if (matcher2.matches())
            System.out.println("valid");
        else
            System.out.println("Invalid");
    }
}