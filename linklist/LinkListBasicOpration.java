// 1.insert at first
// 2. insert At last...addNode
// 3. delete from first
// 4. delete from last
// 5.reverse list


class Node{
        Node link;
        int data;
        Node(int data){
            this.data = data;
            this.link=null;
        }
    } 

class P1{
    Node head;

    public static void main(String[] args) {

        P1 list=new P1();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.printList();
        System.out.println("--------------------------insert first");
        list.insertAtFirst(5);
        list.printList();
        System.out.println("--------------------------delete from first");
        list.deleteFromFirst();
        list.printList();
        System.out.println("--------------------------delete from last");
        list.deleteFromLast();
        list.printList();
        System.out.println("--------------------------reverse list");
        list.reverseList();
        list.printList();

    }

    void addNode(int data){

        Node newNode= new Node(data);

        if(head==null){
            head=newNode;
            return ;
        }
        Node temp=head;
        while (temp.link!=null) {
            temp=temp.link;            
        }
        
        temp.link=newNode;
    }
     void printList(){
        if(head==null){
            System.out.println("no element");
        }

        Node temp=head;

        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.link;
        }
    }


    void insertAtFirst(int data){
        Node newNode=new Node(data);
        newNode.link=head;
        head=newNode;
    }

    void deleteFromFirst(){
        head=head.link;
    }

    void deleteFromLast(){
        Node temp=head;

        while (temp.link.link!=null) {
            temp=temp.link;
        }
        temp.link=null;

    }

    void reverseList(){
        Node prev=null;
        Node curr=head;

        while (curr!=null) {
            Node next=curr.link;
            curr.link=prev;
            
            prev=curr;
            curr=next;            
        }
        head=prev;
    }
}
