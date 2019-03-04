package codeday;
/**
 * Interface
 * Holds moves and returns ObjectListNodes
 * 
 * @author Thomas Edwards, edwards.itj@gmail.com
 * @version 2.0
 * @since 4/8/2014
 */
public interface ObjectListInterface{
    /**
     * Returns the first object in the list
     * @return Object
     */ 
    public Object getFirst();

    /**
     * Returns the last object in the list
     * @return Object
     */ 
    public Object getLast();

    /**
     * Adds an object to the front of a list
     * @param o (Object)
     */ 
    public void addFirst(Object o);

    /**
     * Adds a node to the front of the list
     * @param p (ObjectListNode)
     */
    public void addFirst(ObjectListNode p);

    /**
     *  Adds an object to the end of the list
     *  @param o (Object)
     */
    public void addLast(Object o);

    /**
     *  Adds a node to the end of the list
     *  @param p (ObjectListNode)
     */
    public void addLast(ObjectListNode p);

    /**
     * Removes the first object from the list
     * @return Object
     */ 
    public Object removeFirst();

    /**
     * Removes the last object from the list
     * @return Object
     */
    public Object removeLast();

    /**
     * Inserts an object after the node referenced by p
     * @param p (ObjectListNode)
     * @param o (Object)
     */
    public void insertAfter (ObjectListNode p, Object o);

    /**
     * Inserts a node after the node referenced by p
     * @param p (ObjectListNode)
     * @param q (ObjectListNode)
     */
    public void insertAfter(ObjectListNode p, ObjectListNode q);

    /**
     *  Deletes the node after the node referenced by p
     *  @param p (ObjectListNode)
     *  @return Object
     */
    public Object deleteAfter(ObjectListNode p);

    /**
     * Inserts an item into its correct location within an ordered list
     * @param o (Object)
     */ 
    public void insert(Object o);

    /**
     *  Inserts a node into its correct location within an ordered list
     *  @param r (ObjectListNode)
     */
    public void insert(ObjectListNode r);

    /**
     * Removes the first occurrence of an item in a list 
     * @param 0 (Object)
     * @return Object
     */ 
    public Object remove(Object o);

    /**
     * Returns true if the item is found in the list
     * @param o (Object)
     * @return boolean
     */
    public boolean contains(Object o);

    /**
     * Returns a reference to the node with the requested value; returns null otherwise
     * @param o (Object)
     * @return ObjectListNode
     */
    public ObjectListNode select(Object o);

    /**
     * Determines whether or not a list is empty
     * @return boolean
     */ 
    public boolean isEmpty();

    /**
     *  Removes all elements from a list
     */
    public void clear();

    /**
     * Returns the number of elements in the list
     * return int
     */ 
    public int size();

    /**
     * Makes a copy of a list
     * @return ObjectList
     */
    public ObjectList copyList();

    /**
     *  Reverses a list
     */
    public void reverse();
}

