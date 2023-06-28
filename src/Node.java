public class Node {
    private Object data;
    private Node next;


    public Node (Object dato){
        this.data = dato;
    }
    //Devuelve el valor del nodo
    public Object value(){
        return this.data;
    }
    //Devuelve cual es el nodo con el que esta enlazado
    public Node next(){
        return this.next;
    }
//Define con que nodo estara enlazado todo el nodo
    public void setNext(Node next) {
        this.next = next;
    }
    public void showCOntent(){
        System.out.println("Value: " + data);
    }
}
