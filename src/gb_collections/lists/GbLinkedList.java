package gb_collections.lists;

import gb_collections.GbList;
import gb_collections.Node;
import gb_collections.lists.util.ArrayIterator;

import java.util.Iterator;


public class GbLinkedList<E> implements GbList<E> {
    private int size;
    private Node<E> head;


    public GbLinkedList() {
        this.size = 0;
        this.head = null;
    }


    @Override
    public E get(int index) {
        int count = 0;
        Node<E> curr = head;
        while (count != index) {
            curr = curr.next;
            count++;
        }
        return curr.element;
    }

    @Override
    public Iterator<E> iterator () {
        return new ArrayIterator<>(toArray());
    }

    public E[] toArray() {
//        E[] res = (E[]) new Object[size];
//        Node<E> curr = head;
//        int i = 0;
//        while (curr.next != null) {
//            res[i] = curr.element;
//            i++;
        int size = size();
        E[]res = null;
        try {
            res = (E[]) new Object[size];
        } catch (ClassCastException e){
            e.printStackTrace();
        }
        for (int i = 0; i < size; i++) {
            res[i] = get(i);
        }
        return res;
    }

    @Override
    public void add (E value){
        if (head == null) this.head = new Node<>(value);
        else{
            Node<E> curr = head;
            while (curr.next!=null){
                curr = curr.next;
            }
            curr.next = new Node<>(value);
        }
        size++;
    }



    @Override
    public void remove (E value){
        if (head == null) {
            return;
        }

        if (head.element.equals(value)) {
            head = head.next;
            size--;
            return;
        }

        Node<E> curr = head;
        while (curr.next != null) {
            if (curr.next.element.equals(value)) {
                curr.next = curr.next.next;
                size--;
                return;
            }
            curr = curr.next;
        }
    }



    @Override
    public void removeByIndex (int index){
        if(index == 0) {
            head = head.next;
            size--;
            return;
        }

        int count = 0;
        Node<E> curr = head;
        Node<E> prev = null;
        while (count != index) {
            prev = curr;
            curr = curr.next;
            count++;
        }

        prev.next = curr.next;
        size --;
    }

    @Override
    public int size () {
        return size;

    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        Node<E> curr = head;
        if (curr == null){
            builder.append("]");
            return builder.toString();
        }
        while (curr != null) {
            builder.append(curr.element).append(", ");
            curr = curr.next;
        }
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}

