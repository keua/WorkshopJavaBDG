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
public class List<Type> {
    private Node<Type> head;
    private int length;
    private Node<Type> tail;

    /**
     * 
     */
    public List() {
        this.head = null;
        this.length = 0;
        this.tail= null;
    }

   /**
    * 
    * @param head
    * @param lenght
    * @param tail 
    */
    public List(Node head, int lenght, Node tail) {
        this.head = head;
        this.length = lenght;
        this.tail = tail;
    }

    /**
     * @return the head
     */
    public Node<Type> getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @return the tail
     */
    public Node getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(Node tail) {
        this.tail = tail;
    }
    
    /**
     * @param index of item list
     * @return node that match with the index
     */
    public Type getItem(int index) {
        if (this.getHead() != null) {
            Node<Type> node = this.getHead();
            int contador = 0;
            while (node != null) {
                if (contador == index) {
                    return node.getValue();
                }
                node = node.getChild();
                contador++;
            }
            return this.getHead().getValue();
        } else {
            return null;
        }
    }
    /**
     * @param object that wants to add in the list
     */
    public void addItem(Object object){
        if (this.head == null) {
            this.setHead(new Node(null,object));
            this.setTail(this.getHead());
            this.length++;
        } else {
            Node tmp = this.getHead();
            this.setHead(new Node(tmp,object));
            this.setTail(tmp);
            this.length++;
        }
    }
}
