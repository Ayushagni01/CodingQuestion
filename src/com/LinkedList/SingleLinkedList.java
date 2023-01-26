package com.LinkedList;

public class SingleLinkedList {

   static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    Node head=null;
    //now concentrate on the following things

    public static void main(String[] args) {


        SingleLinkedList l=new SingleLinkedList();
        l.head=new Node(5);
        Node second=new Node(10);
        Node third=new Node(20);
        l.head.next=second;
        second.next=third;


        //print the linkedlist using the iterative and non iterative approached
       // printListed(l.head);
        //print the node using recursion
        printNode(l.head);

    }

    //using loop
    public static void printListed(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    public static Node printNode(Node head){

        //base case
        if(head==null)
        {
            return null;
        }
        System.out.print(head.data+"-->");
        return printNode(head.next);

    }

}
