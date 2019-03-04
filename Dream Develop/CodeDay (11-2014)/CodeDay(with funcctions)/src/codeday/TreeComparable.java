package codeday;
// TreeComparable.java
/**
 * Interface
 * Override methods that enable user to define what happens when you compare, operate, or visit
 */
public interface TreeComparable {
    /**
     * Compares two Objects
     * @param o (Object)
     * @return int
     */
    public int compareTo(Object o);
    /**
     * Operates an Object that is the same
     * @param o (Object)
     */
    public void operate(Object o);
    /**
     * Method to determin what it means to visit an Object
     * Print
     */
    public void visit();
}
     