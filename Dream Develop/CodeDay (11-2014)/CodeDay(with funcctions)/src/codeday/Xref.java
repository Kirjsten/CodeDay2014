package codeday;

import java.io.*;
import java.util.Scanner;
/**
 * Holds all Dream trees and all Project trees
 * 
 * @author Thomas Edwards, edwardsitj@gmail.com
 * @version 3.0
 * @since 11/8/2014
 */
public class Xref
{
    
    private static ObjectBinaryTree superDreamTree = new ObjectBinaryTree();     
    private static ObjectBinaryTree superProjectTree = new ObjectBinaryTree();
    /**
     * Constructor for objects of class Index
     * @param pw (PrintWriter)
     */
    public Xref()
    {
        Person person = new Person();
    }

    public static void searchDream(String keyword)
    {
        //dreamTree.search(
    }
    public static void insertDream(ObjectBinaryTree dreamTree)
    {
        superDreamTree.insertBST((Object)dreamTree);
    }
    public static void insertProject(ObjectBinaryTree projectTree)
    {
        superDreamTree.insertBST((Object)projectTree);
    }
    public static void setUserName(String userName)
    {
       //userName.compareTo(.getUserName());
    }
    public static void setPassword(String password)
    {
        
    }
}
