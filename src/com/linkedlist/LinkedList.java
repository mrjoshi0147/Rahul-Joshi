package com.linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;

    private int size;

    public class Node {

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insertfirst(int value) {

        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertlast(int value) {
        if (size == 0) {
            insertfirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public int deletefirst() {

        if (size == 0) {
            System.out.println("empty");
            return -1;
        }
        int temp = head.value;
        head = head.next;
        size--;
        return temp;
    }

    public int deletelast() {

        if (size < 2) {
            return deletefirst();
        }

        Node temp = head;

        while (temp.next != tail) {

            temp = temp.next;
        }

        int val = tail.value;
        tail = temp;
        temp.next = null;
        size--;
        return val;
    }

    public Node get(int index) {

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public void insertbetween(int index, int value) {

        if (index == 0) {
            insertfirst(value);
            return;
        }

        if (index == size) {
            insertlast(value);
            return;
        }

        Node prev = get(index - 1);
        Node node = new Node(value);
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    public int deleteatindex(int index) {

        if (index == 0) {
            return deletefirst();
        }

        if (index == size - 1) {
            return deletelast();
        }

        Node prev = get(index - 1);
        int temp = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return temp;
    }

    public void duplicates() {

        Node temp = head;

        while (temp.next != null) {

            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
                size--;
            } else {
                temp = temp.next;
            }
        }
        tail = temp;
    }

    public Node find(int value) {

        Node temp = head;

        while (temp != null) {

            if (temp.value == value) {
                return temp;
            }
        }
        return null;
    }

    public void reverse() {
        reverse(head);
    }

    private void reverse(Node node) {

        if (node == tail) {
            head = tail;
            return;
        }

        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public LinkedList merge(LinkedList first, LinkedList second) {

        LinkedList list = new LinkedList();

        Node f = first.head;
        Node s = second.head;

        while (f != null && s != null) {

            if (f.value < s.value) {
                list.insertlast(f.value);
                f = f.next;
            } else {
                list.insertlast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            list.insertlast(f.value);
            f = f.next;
        }

        while (s != null) {
            list.insertlast(s.value);
            s = s.next;
        }

        return list;
    }

    public Node mid() {

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public LinkedList mergesort(LinkedList list) {

        if (list.size == 1) {
            return list;
        }
        Node mid = list.mid();
        LinkedList first = new LinkedList();
        first.head = list.head;
        first.tail = mid;
        first.size = (list.size + 1) / 2;

        LinkedList second = new LinkedList();
        second.head = mid.next;
        second.tail = list.tail;
        second.size = list.size / 2;

        mid.next = null;

        first = mergesort(first);
        second = mergesort(second);

        return merge(first, second);
    }

    public LinkedList oddeven(LinkedList list) {
        LinkedList odd = new LinkedList();
        LinkedList even = new LinkedList();

        Node temp = list.head;
        while (temp != null) {
            if (temp.value % 2 != 0) {
                odd.insertlast(temp.value);
            } else {
                even.insertlast(temp.value);
            }
            temp = temp.next;
        }
        odd.tail.next = even.head;
        odd.tail = even.tail;
        return odd;
    }

    public void oddeven1() {


        Node odd_head = null;
        Node odd_tail = null;

        Node even_tail = null;
        Node even_head = null;

        Node temp = head;

        while (temp != null) {

            if (temp.value % 2 != 0) {
                if (odd_head == null) {
                    odd_head = temp;
                    odd_tail = temp;
                } else {
                    odd_tail.next = temp;
                    odd_head = temp;
                }
            } else {
                if (even_head == null) {
                    even_head = temp;
                    even_tail = temp;
                } else {
                    even_tail.next = temp;
                    even_tail = temp;
                }
            }
            temp = temp.next;
        }
    }


}
