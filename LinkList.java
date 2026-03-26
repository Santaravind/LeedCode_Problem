package DSA;

public class LinkList {
    Node head;
 public  class    Node {
     String data;
     Node next;

     Node(String data){
         this.data=data;
         this.next=null;
     }
         }

         //added in first position
         public void addFirst(String data){
      Node newNode=new Node(data);
     if (head==null){
         head=newNode;
         return;
     }
     newNode.next=head;
     head=newNode;
         }

    // add last
    public void addLast(String data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        Node currenNode=head;
        while (currenNode.next !=null){
            currenNode=currenNode.next;
        }
        currenNode.next=newNode;
    }

    //delete last
    public void deleteFirst(){
     if(head==null){
         System.out.println("List is empty!!");
         return;
     }
     head=head.next;
    }

    //delete last

    public void deleteLast(){
     if (head==null){
         System.out.println("List is empty!!!");
         return;
     }

     if (head.next==null){
         head=null;
         return;
     }

     Node last= head.next;
     Node secondLast=head;
     while (last.next!=null){
         last=last.next;
         secondLast=head.next;
     }
     secondLast.next=null;
    }



    public void printNode(){
        Node currenNode=head;
        while (currenNode !=null){
            System.out.print(currenNode.data+"->");
            currenNode=currenNode.next;
        }
        System.out.println(" ");
    }

    //Reverse link list

    public Node revereList(Node head){

     if (head.next==null|| head==null){
         return head ;
     }
     Node newNode=revereList(head.next);
    head.next.next =head;
     head.next=null;
     return newNode;



    }

    public static  void main(String arg[]){
     LinkList list=new LinkList();
     list.addFirst("Hello");
     list.addFirst("bye ...");
     list.addLast("Go");
     list.addFirst("Kya hall");
     list.printNode();

     list.head=list.revereList(list.head);
     list.printNode();


    }
}
