public interface LinearList {
    public void add(int index, Object element);
    public void addBeforeIndex(int index, Object element);
    public void addAfterIndex(int index, Object element);
    public void addAtIndex(int index, Object element);
    public void addAfterElement(Object givenElement, Object newElement);
    public void remove(int index);
    public int size();
    public boolean isEmoty();
    public Object get(int index);
    public void printList();
}
