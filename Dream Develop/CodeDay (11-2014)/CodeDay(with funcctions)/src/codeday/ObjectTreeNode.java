package codeday;
// ObjectTreeNode.java
/**
 * Holds objects in nodes to be placed in a tree
 * 
 * @author Richard Stegman
 * @editor Thomas Edwards
 */
public class ObjectTreeNode implements ObjectTreeNodeInterface {
    private Object info;
    private ObjectTreeNode left;
    private ObjectTreeNode right;
    /**
     * Default constructor for Object Tree Node
     * Sets values to null
     */
    public ObjectTreeNode() {
        info = null;
        left = null;
        right = null;
    }

    /**
     * 1-ar Constructor for Object Tree Node
     * @param o (Object)
     */
    public ObjectTreeNode (Object o) {
        info = o;
        left = null;
        right = null;
    }

    /**
     * Sets the info value
     * @param o (Object)
     */
    public void setInfo(Object o) {
        info = o;
    }

    /**
     * Returns the info value from Object
     * @return Object
     */
    public Object getInfo() {
        return info;
    }
    /**
     * Sets the left node 
     * @param p (ObjectTreeNode)
     */
    public void setLeft(ObjectTreeNode p) {
        left = p;
    }
    /**
     * Returns the left node
     * @return ObjectTreeNode
     */
    public ObjectTreeNode getLeft() {
        return left;
    }
     /**
     * Sets the right node 
     * @param p (ObjectTreeNode)
     */
    public void setRight(ObjectTreeNode p) {
        right = p;
    }
    /**
     * Returns the right node
     * @return ObjectTreeNode
     */
    public ObjectTreeNode getRight() {
        return right;
    }
}
