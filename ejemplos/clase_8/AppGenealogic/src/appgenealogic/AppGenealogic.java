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
public class AppGenealogic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Person> personList = new List<>();
        
        personList.addItem(new Person("Josue","BDG"));
        personList.addItem(new Person("Osman","BDG, TIGO"));
        personList.addItem(new Person("Alama","TIGO"));
        personList.addItem(new Person("Gaby","TIGO"));
        personList.addItem(new Person("Keneth","BDG, seguros"));
        personList.addItem(new Person("Sian","BDG, TIGO"));
        personList.addItem(new Person("Felipe","BDG"));
        personList.addItem(new Person("Nery","TIGO"));
        personList.addItem(new Person("Leo","TIGO"));
        personList.addItem(new Person("Boriss","BDG,TIGO"));
        
        List list = new List();
        
        list.addItem(new Person("Josue","BDG"));
        list.addItem(new Person("Osman","BDG, TIGO"));
        list.addItem(new Person("Alama","TIGO"));
        list.addItem(new Person("Gaby","TIGO"));
        list.addItem(new Person("Keneth","BDG, seguros"));
        list.addItem(new Person("Sian","BDG, TIGO"));
        list.addItem(new Person("Felipe","BDG"));
        list.addItem(new Person("Nery","TIGO"));
        list.addItem(new Person("Leo","TIGO"));
        list.addItem(new Person("Boriss","BDG,TIGO"));
        
        Node node1 = new Node(null,new Person("Josue","BDG"));
        Node node2 = new Node(node1,new Person("Osman","BDG, TIGO"));
        Node node3 = new Node(node2,new Person("Alama","TIGO"));
        Node node4 = new Node(node3,new Person("Gaby","TIGO"));
        Node node5 = new Node(node4,new Person("Keneth","BDG, seguros"));
        Node node6 = new Node(node5,new Person("Sian","BDG, TIGO"));
        Node node7 = new Node(node6,new Person("Felipe","BDG"));
        Node node8 = new Node(node7,new Person("Nery","TIGO"));
        Node node9 = new Node(node8,new Person("Leo","TIGO"));
        Node node10 = new Node(node9, new Person("Boriss","BDG,TIGO"));
        
        Node nodeAux = node10;
        while (nodeAux != null) {
            System.out.println("I'm "+ ((Person)nodeAux.getValue()).getStrName()+" and i'm working in "+ ((Person)nodeAux.getValue()).getStrWorkingPlace());
            nodeAux = nodeAux.getChild();
        }
        
        for (int i = 0; i < list.getLength(); i++) {
            System.out.println("I'm "+ ((Person)list.getItem(i)).getStrName()+" and i'm working in "+ ((Person)list.getItem(i)).getStrWorkingPlace());
        }
        
        for (int i = 0; i < personList.getLength(); i++) {
            System.out.println("I'm "+ personList.getItem(i).getStrName()+" and i'm working in "+ personList.getItem(i).getStrWorkingPlace());
        }
    }
    
}
