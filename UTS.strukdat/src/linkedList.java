import java.util.Scanner;

public class linkedList {
    Node head = null;
    Node tail = null;


    public void add(String string) {
        Node n = new Node();
        n.setAngka(string);
        

        if (head == null) {
            head = n;
            tail = n;
        }else{
            tail.setNextNode(n);
            tail = n;
        }
    }
    public boolean remove(String value){
        if (this.head == null) {
            return false;
        }

        Node n = this.head;
        if (n.getAngka() == value){
            if(this.head == this.tail){
                this.head = null;
                this.tail = null;
            }else{
                this.head = this.head.getNextNode();
            }
            return true;
        }
        while (n.getNextNode() != null && n.getNextNode().getAngka() != value) {
            n = n.getNextNode();
        }
        if (n.getNextNode()!= null) {
            if (n.getNextNode().getAngka() == tail.getAngka()) {
                this.tail = n;
            }
            n.setNextNode(n.getNextNode().getNextNode());
        }
        return false;
    }
    public boolean contains(String value) {
        Node n = this.tail;
        while (n !=null && n.getAngka() == ("value")) {
            n= n.getNextNode();
        }
        if (n == null) {
            return false;
        }
        return true;
    }
    public String txt() {
        String output = "";
        Node n = this.head;
        while (n != null){
            output += n.getAngka() +" ";
            n = n.getNextNode();
        }
        return output;
    }
}