package dev.hotdeals.design_pattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication
{

    public static void main(String[] args)
    {
        String password = "examplePassword";
        System.out.println("Password: " + password);
        String encodedPassword = PasswordService.encodePassword(password);
        System.out.println("Encoded Password: " + encodedPassword);
        encodedPassword = PasswordService.encodePassword(password);
        System.out.println("Encoded Password: " + encodedPassword);
        encodedPassword = PasswordService.encodePassword(password);
        System.out.println("Encoded Password: " + encodedPassword);
    }

}
