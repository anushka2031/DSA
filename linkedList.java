public class linkedList {

    Node head,temp;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void insert(int data){

        Node newNode = new Node(data);
        newNode.data = data;
        head = newNode;
    }

    void addNodes(int data){
        
        temp = head ;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.data = data;
        newNode.next = null;
        temp.next = newNode;


    }

    void reverse(){

        if(head == null || head.next == null){
            return;
        }

        Node curr = head;
        Node temp;

        while (curr.next!=null) {
            temp = curr.next;
            curr.next = temp.next;
            temp.next = head;
            head = temp;
        }
        
    }

    void mid(){

       Node slow = head;
       Node fast = head;
       while(slow.next!= null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
       }
       System.out.println(slow.data);
    }

    void cycle(){

       Node slow = head;
       Node fast = head;
       while(fast!= null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(fast == slow){
            System.out.println("Has Cycle");
        }
       }
       System.out.println("No Cycle");

    }

    // void deleteEnd(){

    //     while ((head == null || head.next == null)) {
    //         head = null;
    //         return;
    //     }

    //     temp = head;
    //     while (temp.next.next != null) {
    //         temp.next=null;
    //     }
    // }

    void display(){
        temp = head ;
        
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
    public static void main(String[] args) {
        
        linkedList list = new linkedList();
        list.insert(1);
        list.addNodes(2);
        list.addNodes(3);
        list.addNodes(4);
        // list.deleteEnd();
        // list.reverse();
        list.display();
        // list.mid();
        list.cycle();

      

    }

}
