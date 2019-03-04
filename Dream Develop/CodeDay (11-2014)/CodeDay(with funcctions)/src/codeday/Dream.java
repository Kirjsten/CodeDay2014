package codeday;

import java.io.*;
import java.util.Scanner;
/**
 * Write a description of class Dreams here.
 * 
 * @author Thomas Edwards
 * @since 11/8/2014
 */
public class Dream
{
    // instance variables - replace the example below with your own
    private String dreamTitle;
    private String dreamDescription;
    private boolean real = false;
    private Scanner keyboard = new Scanner(System.in);
    private String[] keywords;
    /**
     * Constructor for objects of class Dreams
     */
    public void Dreams()
    {
        setDream();
    }
    private void setDream()
    {
        System.out.print("Dream Title: ");
        dreamTitle = keyboard.nextLine();
        setDreamDescription();
    }
    private void setDreamDescription()
    {
        System.out.print("Dream Description: ");
        dreamDescription += (" " + keyboard.nextLine());
        dreamDescription += keyboard.nextLine();
        dreamDescription += keyboard.nextLine();
        //parse for hashtags
        getTags();
    }
    private void getTags()
    {
       keywords = dreamDescription.split("");
    }
    public void setReal()
    {
        real = true;
    }
    public boolean getReal()
    {
        return real;
    }
    public void notifyUser(String userName)
    {
        System.out.print("Do you approve this developer to make your dream come true");
        String approve =  keyboard.next();
        if (approve.toLowerCase().contains("y"))
        {
            this.setReal();
            System.out.print(userName + "made your dream come true");
        }
    }
    public String getDreamTitle()
    {
        return dreamTitle;
    }
    public String getDreamDescription()
    {
        return dreamDescription;
    }
    public boolean searchKeyword(String keyword)
    {
        for (int count = 0; count < keywords.length; count++)
        {
            if (keywords[count].toLowerCase() == keyword.toLowerCase())
            {
                return true;
            }
        }
        return false;
    }
    
    
}
