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
        list.display();

      

    }

}
