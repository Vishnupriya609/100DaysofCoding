package com.objects;

public class objects {

    int i;
    int j;

    // default constructor
    public objects() {
        this.i = 10;
        this.j = 20;
    }

    // parameterized constructor
    public objects(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int add() {
        return i + j;
    }

    public static void main(String[] args) {

        objects o1 = new objects();
        objects o2 = new objects(15, 49);
        objects o3 = new objects(20, 40);

        System.out.println(o1.add());
        System.out.println(o2.add());
        System.out.println(o3.add());
    }
}