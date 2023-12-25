public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedListObject = new LinkedList(4);
        linkedListObject.append(1);
        linkedListObject.append(23);
        linkedListObject.append(121);
        linkedListObject.removeNode(2);
        //System.out.println(linkedListObject.removeFirst().value);
       // System.out.println(linkedListObject.removeFirst().value);
       // System.out.println(linkedListObject.removeFirst().value);
        //System.out.println(linkedListObject.removeFirst().value);
       // System.out.println(linkedListObject.removeFirst());


       // System.out.println(linkedListObject.removeLast().value);
        //System.out.println(linkedListObject.removeLast().value);
       // linkedListObject.getHead();
        //linkedListObject.getTail();
        //linkedListObject.getLength();
       linkedListObject.printList();
    }
}
