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

   public Node head=null;
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
       // printNode(l.head);
        //print length using loop
        //printLength(l.head);
        //print the length using recursion
        //int len=printLengthRecurison(l.head);
        //System.out.println("print the length is "+len);
        //add the node in the begining of the node
       // addNodeatBegining(l.head,30);
       //insert node at the end of the linkedlist
        insertNodeAtEnd(l.head,100);


    }
    //insert a node in the linkedList
    public static void addNodeatBegining(Node head,int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        printNode(head);
    }

    public static void insertNodeAtEnd(Node head,int data){
        Node newNode=new Node(data);
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            prev=curr;
            curr=curr.next;
        }
        System.out.println(prev.data);


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
    //print the length of the singly linked list
    public static void printLength(Node head){
        int c=0;
        while(head!=null){
            c++;
            head=head.next;
         }
        System.out.println("The length of linked list is "+c);

    }
    //print the length using the recursion
    public static int printLengthRecurison(Node head){
        if(head==null)return 0;

        return 1+ printLengthRecurison(head.next);


    }

}
