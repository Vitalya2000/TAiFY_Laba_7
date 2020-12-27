package com.metanit;

public class Chain {
    private int key;
    private String value;
    private Chain next;

    Chain(int key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public Chain getNext() {
        return next;
    }

    public void setNext(Chain next) {
        this.next = next;
    }
}

