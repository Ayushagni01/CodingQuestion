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
        Node fourth=new Node(30);
        third.next=fourth;

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
       // insertNodeAtEnd(l.head,100);
        //insert data at the end
       // insertAtEndNode1(l.head, 120);
        //insert a node at the given positions\
        //insertAtPosition(l.head,40,3);
        //delete a node in the linked list
        //deleteFirstNode(l.head);
        //delete at the end of the node
        deleteAtTheEndOfLinkedList(l.head);
    }

    //delete the first node in the single list
    public static void deleteFirstNode(Node head){

        if(head==null) return;
        Node temp=head;
        head=head.next;
        //return the deleted node here
        temp.next=null;
        printNode(temp);
    }

    //delet the  node at the end of the linked list
    public static void deleteAtTheEndOfLinkedList(Node head){
    if(head==null || head.next==null)
    {
        System.out.println(head.data);
        return ;
    }
    //now we are defining the dat
    Node pre=null;
    Node curr=head;
    while(curr.next!=null){
        pre=curr;
        curr=curr.next;
    }
    pre.next=null;
        System.out.println("The remaining nodes are");
        printNode(head);

    System.out.println("Deleted nodes are "+curr.data);
    }

    //delete a node at the given positons




    //insert a node at the given positions
    public static void insertAtPosition(Node head,int data, int position){
        Node new_Node =new Node(data);
        if(position==1){
            new_Node.next=head;
            head=new_Node;
        }else{
                Node prev=null;
                Node curr=head;
                int c=1;
                while(position-1>c){
                    curr=curr.next;
                    c++;
                  //  System.out.println(curr.data);
                }
                new_Node.next=curr.next;
                curr.next=new_Node;
                printNode(head);


        }
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
        prev.next=newNode;
        //print the node here
        printNode(head);
    }

    //another method to add the method at the end of the linkedlist
    public static void insertAtEndNode1(Node head,int data){
        if(head==null){
            head=new Node(data);
            return;
        }
        //if head is not null
        if(head==null){
            System.out.println("head is null");
        }
        Node curr=head;

        while(null!=curr.next){
            curr=curr.next;
            System.out.println(curr.data);
        }

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
