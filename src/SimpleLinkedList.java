public class SimpleLinkedList {

    private Node first; //Referencia al primer nodo de la linkedlist

    public SimpleLinkedList() {
        this.first = null;
    }

    public void push(Object obj) {
        //Este nodo sera la cabeza de la lista enlazada simple
        Node newNode = new Node(obj);
        //EL nuevo nodo creado es el primero (apunta primero a first y luego a newnode es el nuevo first)
        newNode.setNext(this.first);
        this.first = newNode;
    }

    public Node pop() {
        Node temp = this.first;//Guarda referencia al primer nodo en la variable temp.
        this.first = this.first.next();
        return temp;
    }

    public Node delete(Object val) {
        Node currentNode = this.first;
        Node previousNode = this.first;
        while (!currentNode.value().equals(val)) {
            if (currentNode.next() == null) {
                return null;
            } else {
                previousNode = currentNode;
                currentNode = currentNode.next();
            }
        }
        if (currentNode == this.first) {
            this.first = this.first.next();
        } else {
            previousNode.setNext(currentNode.next());
        }
        return currentNode;
    }

    public boolean isEmpty() {
        return (this.first == null);
    }

    public Node contains(Object val) {
        Node currentNode = this.first;
        while (!currentNode.value().equals(val)) {
            if(currentNode.next() == null) {
                return null;
            }
            else{
                currentNode = currentNode.next();
            }
        }
        return currentNode;
    }

    public void printContent() {
        Node currentNode = first;
        System.out.println("Mostrar elementos de lista enlazada");
        while (currentNode != null) {
            currentNode.showCOntent();
            currentNode = currentNode.next();
        }
    }


}
