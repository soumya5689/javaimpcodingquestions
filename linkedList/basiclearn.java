package linkedList;

import java.sql.SQLOutput;

public class basiclearn{
    //using recursive way
    public static void displayr(Node head){
        if(head == null){
            return;
        }else {
            System.out.print(head.data + " ");
            displayr(head.next);
        }
    }


    //using function

//    public static void display(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//
//    }
  public static class Node{
      int data; //value
      Node next;  //address of next node
      Node(int data){
          this.data = data;
      }
  }

    public static void main(String[] args){
         Node a = new Node(5);
       // System.out.println(a.next); // null
         Node b = new Node(3);
         Node c = new Node(9);
         Node d = new Node(16);
         Node e = new Node(19);

         // 5   3   9   16  19
        a.next = b;  //5--> 3  9  16  19
        b.next = c;  // 5--> 3-->  9  16  19
        c.next = d;  //5--> 3--> 9 --> 16  19
        d.next = e;  // 5--> 3 --> 9 --> 16 -->19
//
//        Node temp = a;
//        while(temp!=null){
//            System.out.println(temp.data + " ");
//            temp = temp.next;
//        }

        //display(a);
        displayr(a);

    }

}
