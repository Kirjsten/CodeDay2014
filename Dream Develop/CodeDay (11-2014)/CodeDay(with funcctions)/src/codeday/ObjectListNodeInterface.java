package codeday;
/**
 * Interface
 * Creates and modifies nodes in a list
 * 
 * @author Thomas Edwards, edwards.itj@gmail.com
 * @version 2.0
 * @since 4/8/2014
 */
public interface ObjectListNodeInterface
{
    /**
     * Sets info field
     * @param Object
     */ 
    public void setInfo(Object o);
    /**
     * Returns object in info field
     * @return Object
     */ 
    public Object getInfo();
    /** 
     * Sets next field
     * @param ObjectListNode
     */
    public void setNext(ObjectListNode p);
    /** 
     * Returns object in info field
     * @return ObjectListNode
     */
    public ObjectListNode getNext();
}
