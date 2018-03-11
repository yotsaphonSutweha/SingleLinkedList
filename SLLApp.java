public class SLLApp {
    public static void main(String args[]){
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println(list.size());

        list.add(1, 'a');
        list.add(2, 'b');
        list.add(3, 'c');

        list.add(3, 'p');

        System.out.println(list.size());

        list.printList();
    }


}
