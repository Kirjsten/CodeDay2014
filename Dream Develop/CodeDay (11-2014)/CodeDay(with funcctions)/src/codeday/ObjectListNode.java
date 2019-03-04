package codeday;
// ObjectListNode.java
/**
 * Creates and modifies nodes in a list
 * 
 * @author Thomas Edwards, edwards.itj@gmail.com
 * @version 2.0
 * @since 4/8/2014
 */
public class ObjectListNode implements ObjectListNodeInterface{
    private Object info;
    private ObjectListNode next;
    /**
     * Default constructor
     */     
    public ObjectListNode() {
        info = null;
        next = null;
    }

    /**
     * Constructor to pass in one Object
     * @param Object
     */ 
    public ObjectListNode (Object o) {
        info = o;
        next = null;
    }    

    /**
     * Constructor to pass in one Object and a ObjectListNode
     * @param Object
     * @param ObjectListNode
     */ 
    public ObjectListNode (Object o, ObjectListNode p) {
        info = o;
        next = p;
    }       

    /**
     * Sets info field
     * @param Object
     */ 
    public void setInfo(Object o) {
        info = o;
    }    

    /**
     * Returns object in info field
     * @return Object
     */ 
    public Object getInfo() {
        return info;
    }

    /** 
     * Sets next field
     * @param ObjectListNode
     */
    public void setNext(ObjectListNode p) {
        next = p;
    }

    /** 
     * Returns object in info field
     * @return ObjectListNode
     */
    public ObjectListNode getNext() {
        return next;
    }
}
