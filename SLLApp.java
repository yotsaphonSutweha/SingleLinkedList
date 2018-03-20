public class SLLApp {
    public static void main(String args[]){
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println(list.size());

        list.add(1, 'a');
        list.add(2, 'b');
        list.add(3, 'c');

        list.addBeforeIndex(3, 'p');
        list.addAfterIndex(2, 'K');
        list.add(6, 'd');
        list.add(7, 'e');
        list.add(8, 'f');

        list.addAtIndex(7, 'X');
        list.addAfterElement('d','V');
        System.out.println(list.size());

        list.printList();
    }


}
