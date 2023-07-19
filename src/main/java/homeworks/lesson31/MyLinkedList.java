package homeworks.lesson31;

import java.util.Optional;

public class MyLinkedList<E> {
    public MyNode<E> head;
    public int size;

    public MyLinkedList(E data) {
        this.head = new MyNode<>(data);
        this.size = 1;
    }

    public void addTail(E data) {
        MyNode<E> curr = head;
        if (head == null) {
            head = new MyNode<E>(data);
        }
        while (curr != null) {
            curr = curr.next;
        }
        curr.next = new MyNode<>(data);
        this.size++;
    }

    public void addHead(E data) {
        MyNode<E> newhead = new MyNode<>(data, head);
        this.head = newhead;
        this.size++;
    }

    public void clear() {
        this.head = null;
        this.size = 0;
    }

    public Optional <E> findByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index + "is wrong");
        }
        int counter = 0;
        MyNode<E> curr = head;
        while (curr != null) {
            curr = curr.next;
            counter++;
            if (counter == index) {
                return Optional.of(curr.data);
            }
        }
        return Optional.empty();

    }

}

