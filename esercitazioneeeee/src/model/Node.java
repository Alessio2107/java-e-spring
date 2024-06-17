package model;

import abstractClasses.MultimediaElement;

public class Node {
    MultimediaElement data;
    Node next;

    public Node(MultimediaElement data) {
        this.data = data;
        this.next = null;
    }
    public Node(){

    }

    public MultimediaElement getData() {
        return this.data;
    }

    public void setData(MultimediaElement data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
