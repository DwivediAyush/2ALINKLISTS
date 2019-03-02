import java.sql.SQLOutput;

class Node{
    int data;
    Node next;
}
public class MyLinkList {


    Node head;
     int total=0;
     //insering the node at the end
     public void insert(Node newNode)
     {
         System.out.println("inserting new node"+newNode.data);
         if(head==null)
         {
             head=newNode;
             total++;
         }
         else
         {
             Node temp=head;
             while(temp.next!=null)
             {
                 temp=temp.next;
             }
             temp.next=newNode;
             total++;
         }
     }
     void display()
     {
         System.out.println("MyLnkedlist:");
         Node temp=head;
     while(temp!=null)
     {
       System.out.print(temp.data+"-->");
       temp=temp.next;
     }

         System.out.println("null");
     }
     void insertatbegining(Node newNode)
     {
             newNode.next=head;
             head=newNode;
             total++;

     }

     //delete from last
     void delete()
     {
         if(head==null)
             System.out.println("list is empty");
         else
         {   total--;
             Node current=head;
             Node previous=null;
             while(current.next!=null)
             {
                 previous=current;
                         current=current.next;
             }
             System.out.println("deleting last node"+current.data);
             previous.next=null;
         }


     }
     void insertbeforenode(Node newnode,Node beforenode)
     {Node temp=head;
          Node pre=null;
      int t=0;
              while(temp.data!=beforenode.data)
              {
                  pre=temp;
                  temp=temp.next;
               t++;
              }
              if(pre==null&&t==0)
              {
                  insertatbegining(newnode);
              }
              else {
                   total++;
                  newnode.next = temp;
                 pre.next=newnode;
              }

     }
    void deletebeforenode(Node beforenode)
    {
        Node temp=head;
        Node pre=null;
        int t=0;
        Node[] arr=new Node[size()];
        while(temp.next!=null)
        {
            arr[t]=temp;
            temp=temp.next;
            t++;
        }
        temp=head;
        t=0;

        while(temp.data!=beforenode.data)
        {

               temp=temp.next;
               t++;
        }

         if(t==1)
        {
           deletefrombegin();
        }
        else if(t>1)
        {  total--;
          pre=arr[t-2];
          pre.next=arr[t];
        }
    }

     int size()
    {
        Node temp=head;
        int t=0;
        while(temp.next!=null)
        {
            temp=temp.next;
            t++;
        }
        return t;
    }
     void deletefrombegin()
     {
         if(head==null)
             System.out.println("list is empty");
         else
         {
             Node temp=head;
             System.out.println(temp.data);
             head=head.next;
         }
     }


    public static void main(String[] args) {
        MyLinkList linklist=new MyLinkList();
        Node newnode=new Node();
        newnode.data=10;
        newnode.next=null;
        Node newnode1=new Node();
        newnode1.data=14;
        newnode1.next=null;

        Node newnode2=new Node();
        newnode2.data=14;
        newnode2.next=null;

        linklist.insert(newnode);
        linklist.insert(newnode1);
       linklist.insert(newnode2);
        //linklist.insert(newnode1);
        //linklist.insert(newnode);
        linklist.display();

        Node n=new Node();
        n.data=98765;
        n.next=null;
        linklist.insertatbegining(n);
        linklist.display();
      //  linklist.deletefrombegin();
        Node n4=new Node();
        n4.data=58;
        n4.next=null;
        linklist.insertbeforenode(n4,n);
        linklist.display();
           linklist.deletebeforenode(n4);
        linklist.display();

    }
}
