package codeday;

import java.util.Scanner;
/**
 * Write a description of class Developers here.
 * 
 * @author Shane Sharareh
 * @editor Thomas Edwards
 * @since 11/8/2014
 */
public class Developer extends Person
{
    ObjectBinaryTree dreamTree = new ObjectBinaryTree();
    ObjectBinaryTree projectTree = new ObjectBinaryTree();
    Dream dream;
    /**
     * Constructor for objects of class Developers
     */
    public Developer()
    {
        System.out.println("Do you want to find a new dream");
        searchDream();
    }

    public void setDevInfo(){
       // setDevName(newInfo.getName());//sets real name
        //setDevUserName(newInfo.getUsername()); //sets user name
       //setDevPassword(newInfo.getUsername()); // sets password
    }

    public void searchDream(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Search: ");
        String search = keyboard.next();
        Xref.searchDream(search);
    }

    public void createProject(){
        Project newProject = new Project(dream);//passes the dream object into project class
        newProject.setProject();// sets the attributes of the project
        //Project.getDreamResults();
        projectTree.insertBST(newProject);// inserts the project object into the project tree
    }

    public void getProject()
    {
        
    }  

    public void getDreamResults(){

        //tree.inTrav(dreamTree.getRoot())//Traverses the tree for the dream results
    }

}