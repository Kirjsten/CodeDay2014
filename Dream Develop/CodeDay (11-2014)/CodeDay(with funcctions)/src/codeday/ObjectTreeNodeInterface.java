package codeday;
/**
 * Interface
 * Holds objects in nodes to be placed in a tree
 * 
 * @author Richard Stegman
 * @editor Thomas Edwards
 */
public interface ObjectTreeNodeInterface
{
    /**
     * Sets the info value
     * @param o (Object)
     */
    public void setInfo(Object o);

    /**
     * Returns the info value from Object
     * @return Object
     */
    public Object getInfo();

    /**
     * Sets the left node 
     * @param p (ObjectTreeNode)
     */
    public void setLeft(ObjectTreeNode p);

    /**
     * Returns the left node
     * @return ObjectTreeNode
     */
    public ObjectTreeNode getLeft();

    /**
     * Sets the right node 
     * @param p (ObjectTreeNode)
     */
    public void setRight(ObjectTreeNode p);

    /**
     * Returns the right node
     * @return ObjectTreeNode
     */
    public ObjectTreeNode getRight();
}

