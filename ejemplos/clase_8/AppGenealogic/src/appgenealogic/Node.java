/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appgenealogic;

/**
 *
 * @author selenium
 */
public class Node<Type> {
    private Node child;
    private Type value; 
    public Node() {
    }

    public Node(Node child, Type value) {
        this.child = child;
        this.value = value;
    }

    /**
     * @return the hijo
     */
    public Node getChild() {
        return child;
    }

    /**
     * @param hijo the hijo to set
     */
    public void setChild(Node hijo) {
        this.child = hijo;
    }

    /**
     * @return the value
     */
    public Type getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Type value) {
        this.value = value;
    }
    
}
