package codeday;

import java.util.Scanner;
/**
 * Dreamer Class holds dreamers
 * 
 * @author Thomas Edwards, edwards.itj@gmail.com
 * @version 1.0
 * @since 11/8/2014
 */
public class Dreamer extends Person
{
    ObjectBinaryTree dreamTree = new ObjectBinaryTree();     
    ObjectBinaryTree projectTree = new ObjectBinaryTree();
    /**
     * Constructor for objects of class Dreamer
     */
    public Dreamer()
    {
        System.out.println("Do you want to create a new dream");
        createDream();
    }
    public ObjectBinaryTree createDream()
    {
        Dream dream = new Dream();
        dreamTree.insertBST((Object) dream);
        Xref.insertDream(dreamTree);
        return dreamTree;
    }
    public void getProjects()
    {
        //dreamTree.search(dream.getReal()== true);
    }
    /**
     * @author (Shane Sharareh)
     */
    public void searchDream()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Search: ");
        String search = keyboard.next();
        Xref.searchDream(search);
        
    }
   
}
