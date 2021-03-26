package structure_algorithm;


import java.util.Arrays;
import java.util.Random;

class Node {
    String item;
    Node next;
}

public class linkedList {

    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

        first.item = "one";
        second.item = "two";
        third.item = "three";

        first.next = second;
        second.next = third;

        Node x = first;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }

        Random rd1 = new Random(10);
        Random rd2 = new Random(10);
        int[] a1 = new int[10];
        int[] a2 = new int[10];

        for (int i=0; i < 10; i++) {
            a1[i] = rd1.nextInt();
            a2[i] = rd2.nextInt();
        }

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));


    }
}