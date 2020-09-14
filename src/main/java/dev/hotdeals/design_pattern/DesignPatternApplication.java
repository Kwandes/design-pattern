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

        System.out.println("\n\n");
        String text = "very high value data";
        System.out.println("Text to encrypt: " + text);
        String encryptedText = PasswordService.encrypt(text);
        System.out.println("Encrypted text: " + encryptedText);
        System.out.println("Decrypted text: " + PasswordService.decrypt(encryptedText));
    }

}
