public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();

        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.add(1, 4);
        myLinkedList.addLast(3);

        myLinkedList.printList();

        Integer dataRemove = myLinkedList.remove(1);
        myLinkedList.printList();

        myLinkedList.addLast(5);
        Integer element = 4;
        boolean checkRemove = myLinkedList.remove(element);
        System.out.println(checkRemove);
        myLinkedList.printList();

        System.out.println(myLinkedList.contains(3));

        System.out.println(myLinkedList.add(5));
        myLinkedList.printList();

        System.out.println("Gia tri lay ra la: " + myLinkedList.get(2));

        System.out.println("Gia tri dau tien la: " + myLinkedList.getFirst());
        System.out.println("Gia tri cuoi cung la: " + myLinkedList.getLast());

        myLinkedList.clear();
        myLinkedList.printList();
    }
}
