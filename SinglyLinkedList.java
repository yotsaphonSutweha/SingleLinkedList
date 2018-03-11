public class SinglyLinkedList implements LinearList{
    private Node head;
    private Node beforeCurr;
    private int size;
    private Node current;

    public SinglyLinkedList() {
        head = null;
        beforeCurr = null;
        current = head;
        size = 0;
    }

    private void setCurrent(int index){
        current = head;
        beforeCurr = null;
        for (int i=1;i<index;i++){
            beforeCurr = current;
            current = current.getNext();
        }
    }
    @Override
    public void add(int index, Object element) {
        if(index == 1) {
            // add a node at the head
            Node newNode = new Node(element, null);
            head = newNode;

        }else if(index == (size+1)){
            // add a node at the end
            Node newNode = new Node(element, null);
            setCurrent(index-1);
            current.setNext(newNode);

        }else{
                // add before a given index
                Node newNode = new Node(element, null);
                setCurrent(index);
                current.setPrev(newNode);
                beforeCurr.setNext(newNode);
                newNode.setNext(current);
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if(index == 1){
            // remove at the head
            Node nextHead = head.getNext();
            head = nextHead;
        }else if(index == size){
            // remove at the end
            setCurrent(index);
            beforeCurr.setNext(null);
        } else{
            // remove at a give index
            setCurrent(index);
            beforeCurr.setNext(current.getNext());
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmoty() {
        while(size > 0){
            return true;
        }
        return false;
    }

    @Override
    public Object get(int index) {
        setCurrent(index);
        return current.getElement().toString();
    }

    @Override
    public void printList(){
      Node node = head;
      while(node != null){
          System.out.println(node.getElement().toString());
          node = node.getNext();
      }
    }
}
