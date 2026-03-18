public class intersection2LL {
    
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

    public static void main(String[] args) {
        
        intersection2LL list1 = new intersection2LL();
        intersection2LL list2 = new intersection2LL();

        list1.insert(3);
        list1.addNodes(6);
        list1.addNodes(8);
        list1.addNodes(10);

        list2.insert(4);
        list2.addNodes(8);
        list2.addNodes(10);

        Node temp1 = list1.head;
        Node temp2 = list2.head;
        while (true) {
            if(temp1.data == temp2.data){
                System.out.println(temp1.data);
                break;
            }else if(temp1.next == null || temp2.next == null ){

                if(temp1.next == null) temp1 = list2.head;
                
                if(temp2.next == null) temp2 = list1.head;

            }else{
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
    }


}
