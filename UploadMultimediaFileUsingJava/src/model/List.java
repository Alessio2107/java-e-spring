package model;

import abstractClasses.MultimediaElement;

class List {
    Node head;

    public void insert(MultimediaElement data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void removeLow() {
        Node current = head, prev = null;
        while (current != null) {
            if (!current.data.checkQuality()) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
            } else {
                prev = current;
            }
            current = current.next;
        }
    }

    public void saveSpace() {
        List highQualityList = new List();
        List lowQualityList = new List();

        Node current = head;

        while (current != null) {
            if (current.data.checkQuality()) {
                highQualityList.insert(current.data);
            } else {
                lowQualityList.insert(current.data);
            }
            current = current.next;
        }
        head = highQualityList.head;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}