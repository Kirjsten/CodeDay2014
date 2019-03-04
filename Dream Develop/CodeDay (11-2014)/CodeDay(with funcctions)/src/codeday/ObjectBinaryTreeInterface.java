package codeday;
// ObjectBinaryTree.java
/**
 * Interface:
 * Holds ObjectTreeNodes in a tree structure
 * 
 * @author Richard Stegman
 * @editor Thomas Edwards
 */
public interface ObjectBinaryTreeInterface {
    /**
     * Returns the node at the root of the tree
     * @return ObjectTreeNode
     */
    public ObjectTreeNode getRoot();

    /**
     * Sets the left child of a ObjectTreeNode to paramater r
     * @param parent (ObjectTreeNode) 
     * @param r (ObjectTreeNode)
     */
    public void setLeftChild(ObjectTreeNode parent, ObjectTreeNode r);

    /**
     * Sets the right child of a ObjectTreeNode to paramater r
     * @param parent (ObjectTreeNode) 
     * @param r (ObjectTreeNode)
     */                           
    public void setRightChild(ObjectTreeNode parent, ObjectTreeNode r);

    /**
     * Inserts a duplicate Object into a ObjectTreeNode 
     * Inserts ObjectTreeNode into its correct place in the ObjectTree
     * based on .compareTo()
     * @param o (Object)
     */
    public void insertBST(Object o);

    /**
     * Inserts a duplicate Object into a ObjectTreeNode 
     * Inserts ObjectTreeNode into its correct place in the ObjectTree
     * based on .compareTo()
     * @param o (Object)
     */
    public void insertBSTDuplicate(Object o);

    /**
     * Searches the ObjectBinaryTree for Object
     * Returns the corresponding ObjectTreeNode
     * @param o (Object)
     * @return ObjectTreeNode
     */
    public ObjectTreeNode searchBST(Object o);

    /**
     * Visits nodes in the  ObjectBinaryTree in preorder
     * @param tree (ObjectTreeNode)
     */
    public void preTrav(ObjectTreeNode tree);

    /**
     * Visits nodes in the  ObjectBinaryTree in inorder
     * @param tree (ObjectTreeNode)
     */                           
    public void inTrav(ObjectTreeNode tree);

    /**
     * Visits nodes in the  ObjectBinaryTree in postorder
     * @param tree (ObjectTreeNode)
     */                           
    public void postTrav(ObjectTreeNode tree);

    /**
     * Deletes Object and its ObjectTreeNode from the ObjectBinaryTree
     * @param o (Object)
     */
    public void delete(Object o);
}

