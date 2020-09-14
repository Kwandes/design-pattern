package dev.hotdeals.design_pattern;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;

public class PasswordService
{
    private static final int ENCODING_STRENGTH = 12; // work factor of bcrypt
    private static final String ENCRYPTION_KEY = "very secure key";
    private static final String ENCRYPTION_SALT = "9e965ac7dbbcc628";

    /**
     * Produces a hashed and salted version of a string using Springboots' Bcrypt encoder.
     * In order to see if a given password matches the hashed one, a encoder.matches(string1, string2) method has to be used
     *
     * @param password String to be hashed
     * @return Returns a hashed string
     */
    public static String encodePassword(String password)
    {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(ENCODING_STRENGTH);
        return encoder.encode(password);
    }

    /**
     * Compares 2 hashed passwords
     *
     * @param password  First String for the comparison
     * @param password2 Second password for the comparison
     * @return Returns whether or not the strings match
     */
    public static boolean matches(String password, String password2)
    {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(ENCODING_STRENGTH);
        return encoder.matches(password, password2);
    }

    public static String encrypt(String text)
    {
        TextEncryptor encryptor = Encryptors.text(ENCRYPTION_KEY, ENCRYPTION_SALT);
        return encryptor.encrypt(text);
    }

    public static String decrypt(String text)
    {
        TextEncryptor encryptor = Encryptors.text(ENCRYPTION_KEY, ENCRYPTION_SALT);
        return encryptor.decrypt(text);
    }
}