package codeday;

import java.io.*;
import java.util.Scanner;
/**
 * Write a description of class Info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Info
{
    private String firstName = "fname";
    private String lastName = "lname";
    private String email = "email";

    /**
     * Constructor for objects of class Info
     */
    public Info()
       
    {
    }

    public void setFirstName(String firstNamep)
    {
        firstName = firstNamep;
    }
     public void setLastName(String lastNamep)
    {
        lastName = lastNamep;
    }
     public void setEmail(String emailp)
    {
        email = emailp;
    }
     
      public String getFirstName()
    {
        return firstName;
    }
     public String getLastName()
    {
        return lastName;
    }
     public String getEmail()
    {
        return email;
    }
     
     
}
