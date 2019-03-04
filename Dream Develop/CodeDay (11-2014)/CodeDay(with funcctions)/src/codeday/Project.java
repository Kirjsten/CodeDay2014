package codeday;

import java.util.Scanner;
/**
 * Write a description of class Project here.
 * 
 * @author (Shane Sharareh) 
 * @since (11/8/2014)
 */
public class Project
{
    // instance variables - replace the example below with your own
    private String projectTitle;
    private Dream dream;
    /**
     * Constructor for objects of class Project
     */
    public Project(Dream newDream)
    {
        dream = newDream;
    }

    /**
     * Sets the attributes of the dream
     */
    public void setProject()
    {
        setProjectTitle(dream.getDreamTitle());
        setProjectDescription();
        
        if (projectAsk() == true){
            dream.setReal();   
        }
    }
    public Boolean projectAsk(){
        
        //System.out.println("Would you like to make this dream real? ")
          //Scanner keyboard = new Scanner(System.in);
        //String answer = keyboard.next();
        return true;
    }
    /**
     * Sets project title
     */
    public void setProjectTitle(String newTitle){
        projectTitle = newTitle;    
    }

    /**
     * Sets the description of the project
     */
        public void setProjectDescription(){
            //projectDescription = newDescription;
    }
    /**
     * Displays Project name and description
     */
    public  void displayDreamDescription(){
    System.out.println("Project Title: "+projectTitle);
    System.out.println("Project Description: " + dream.getDreamDescription());
    
}
}