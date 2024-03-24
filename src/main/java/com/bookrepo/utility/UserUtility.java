package com.bookrepo.utility;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.UUID;

public class UserUtility {
    public static Boolean validateUserPassword(String userPassword, String password, String salt){
        String encryptedPass = encryptUserPassword(userPassword, salt);
        return password.equals(encryptedPass);
    }

    public static String getSalt(){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return UUID.randomUUID() + df.format(new Date().getTime());
    }

    public static String encryptUserPassword(String password, String salt){
        String encryptPass="";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] encryptedPassBytes = md.digest(password.getBytes());
            StringBuilder md5Pass = new StringBuilder(Base64.getEncoder().encodeToString(encryptedPassBytes));
            md5Pass.append(salt);
            encryptedPassBytes = md.digest(md5Pass.toString().getBytes());
            encryptPass = Base64.getEncoder().encodeToString(encryptedPassBytes);
        } catch (NoSuchAlgorithmException e){
            System.out.println("Encryption failed "+e.getMessage());
        }
        return encryptPass;
    }
}
