package gb_collections;

public class Node <E> {
    public E element;
    public Node<E> next;

    public Node(E element) {
        this.element = element;
        this.next = null;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}

