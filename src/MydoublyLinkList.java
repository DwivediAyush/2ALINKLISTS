import java.sql.SQLOutput;

class node{
    node pre;
    int data;
    node next;

 }
public class MydoublyLinkList {
    node head;

    void insert(node newnode)
    {
        if(isEmpty())
        {
            head=newnode;
        }
        else
        {
            node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            newnode.pre=temp;
            temp.next=newnode;

        }
    }

    private boolean isEmpty() {
        if(head==null)
            return true;
        else
            return false;
    }
void display()
{
    System.out.println("Doubly linkedlist");
    node temp=head;
    System.out.print("null<--->");
    while (temp!=null)
    {
        System.out.print(temp.data+"--->");
        temp=temp.next;
    }
    System.out.print("null");
}
void delete()
{
    node temp=head;
    if(!isEmpty()) {


        while (temp.next != null) {
            temp = temp.next;
        }
        temp=temp.pre;
        temp.next=null;
    }
    }
    boolean search(node Node)
    {
        if(!isEmpty())
        {
            node temp=head;
            while(temp!=null)
            {
                 if(temp.data==Node.data)
                     return true;
                 temp=temp.next;
            }
        }
        return false;
    }
    public static void main(String[] args) {
node n1=new node();
n1.data=1000;
MydoublyLinkList list=new MydoublyLinkList();
list.insert(n1);

node n2=new node();
n2.data=5000;
list.insert(n2);

        list.display();
        System.out.println(list.search(n2));
        list.delete();
        list.display();
    }
}
