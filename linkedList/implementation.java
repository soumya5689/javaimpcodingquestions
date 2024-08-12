package linkedList;

public class implementation {
    public static class Node{
       int data;
       Node next;
       Node(int data){
           this.data = data;
       }
    }
    public static class linkedlist{
       Node head = null;
       Node tail = null;
       int size = 0;
       //for insert at end position
       void insertAtEnd(int data){
           Node temp = new Node(data);
           if(head==null){
               head = temp;
           }else{
               tail.next = temp;
           }
           tail = temp;
           size++;
       }

       //for inserting at head
       void insertAtHead(int data){
           Node temp = new Node(data);
          if(head == null){     //if head is null
              head = temp;
              tail = temp;
          }else{                //if head is not null
              temp.next = head;
              head = temp;
          }
          size++;
       }


       //for inserting at any position
       void insetAt(int id, int data){
         Node t = new Node(data);
         Node temp = head;
         if(id == size){
             insertAtEnd(data);
             return;
         }else if(id == 0){
             insertAtHead(data);
             return;
         }
         for(int i=0;i<id-1;i++){
             temp = temp.next;
         }
         t.next = temp.next;
         temp.next = t;
         size++;
       }


       //for displaying the linkedlist
         void displayed(){
           Node temp = head;
            while(temp !=null){
               System.out.println(temp.data);
               temp = temp.next;
             }
            size++;
         }


         //for count the size of the linked list
//         int size(){
//           Node temp = head;
//           int count = 0;
//           while(temp!=null){
//               count++;
//               temp = temp.next;
//           }
//           return count;
//         }
    }

    public static void main(String[] args){
        linkedlist li = new linkedlist();
        li.insertAtEnd(4);   // 4
        li.displayed();      //to check
        li.insertAtEnd(6);  //4  6
        li.displayed();      //to check
        li.insertAtHead(10);
        li.displayed();      //to check
    }
}
