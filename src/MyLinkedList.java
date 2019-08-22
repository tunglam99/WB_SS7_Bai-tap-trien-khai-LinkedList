import org.w3c.dom.Node;

public class MyLinkedList<E> {
    class Node {
        private Node next;
        private Object data;

        private Node(Object data) {
            this.data = data;
        }

        private Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNodes;

    public MyLinkedList() {
    }

    public Node getHoead(){
        return head;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public void add(int index, E element){
        Node temp = head;
        for (int i=0; i<index && temp.next != null;i++){
            temp = temp.next;
        }
        Node holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E element){
        Node temp =head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element){
        Node temp = head;
        for (int i = 0; i < numNodes && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        temp.next.next = null;
        numNodes++;
    }

    public E remove(int index) {
        if (index > numNodes || index < 0) {
            return null;
        }
        Node temp = head;
        Node pre = head;
        for (int i = 0; i < index; i++) {
            pre = temp;
            temp = temp.next;
        }
        E holder = (E) temp.getData();
        pre.next = temp.next;
        numNodes--;
        return holder;
    }

    public int size() {
        return this.numNodes;
    }

    public boolean remove(Object e) {
        Node temp = head;
        for (int i = 0; i < numNodes && temp.next != null; i++) {
            if (temp.data == e) {
                remove(i);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    public MyLinkedList clone(){
        return this;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData() == o) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public boolean add(E e) {
        if (!contains(e)) {
            addLast(e);
            return true;
        }
        return false;
    }

    public void printList() {
        Node temp = head;
        for (int i = 0; i < numNodes && temp != null; i++) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

    public E get(int index) {
        if (index > numNodes || index < 0) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(numNodes - 1);
    }

    public void clear() {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            temp.data = null;
            temp = temp.next;
        }
        numNodes = 0;
        System.out.println("LinkedList da bi xoa");
    }



}
