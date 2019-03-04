package codeday;

import java.io.*;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Dreamer Class holds dreamers
 * 
 * @author Thomas Edwards, edwards.itj@gmail.com
 * @version 1.0
 * @since 11/8/2014
 */
public class Person 
{   
    private PrintWriter pw;
    private String userName = "user";
    private String password = "pass";
    
    Dreamer dreamer;
    Developer dev;
    private boolean devOrNot = false;
    Info info = new Info();

    /**
     * Constructor for objects of class Person
     */
    public Person(){ 
        
        /**
        try{
            pw = new PrintWriter(new FileWriter("Database/PeopleLogin/person.txt"));
        }
        catch(IOException e)
        {

        }
        setInfo();
        */
        
    }
    

    private void setInfo()
    {
       //info = new Info();
    }
    public void setPerson(){
        try { 
            File something = new File("C:\\Users\\Dan\\Desktop\\CodeDay\\src\\Database\\PeopleLogin\\"+userName+".txt");
            something.createNewFile();
            pw = new PrintWriter(something);
            pw.write("");
            pw.println(userName);
            pw.println(info.getFirstName()/** +""+info.getLastName() */);
            pw.println(password);
            pw.println(info.getEmail());
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
     * 
     * 
     * @returns Username
     */
     public String getUserName()
    {
        return userName;
    }
     /**
      * Sets the username from registerGUI 
      * @param userName 
      */
      public void setUserName(String userNamed)
    {
        
        userName = userNamed;
        
    }
      /**
       * sets the first and last name
       * @param name 
       */
      public void setName(String name)
    {
        info.setFirstName(name);
        
        /**
        String[] nameArray = name.split("[ ]+");
        for (int count = 0; count < nameArray.length; count++)
        {
            info.setFirstName(nameArray[0]);
            info.setLastName(nameArray[1]);
        }
        */
    }
      /**
       * sets the password
       * @param password 
       */
      public void setPassword(String passWord)
    {
        password = passWord;
    }
      
      /**
       * sets the User's email
       * @param email 
       */
      public void setEmail(String email)
    {
        info.setEmail(email);
    }
      
      /**
       * checks whether User is Developer, or Dreamer
       * @param isADev 
       */
     public void setType(boolean isADev)
     {
         if (isADev == true)
         {
             devOrNot = true;
             dev = new Developer();
         }
         else
         {
             dreamer = new Dreamer();
         }
         }
     }
    

