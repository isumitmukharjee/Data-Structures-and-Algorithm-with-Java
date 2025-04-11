public class LLImplementation {

    // Node class to define structure of a linked list node
    static class Node {
        int data;
        Node next;

        // Constructor with data and next pointer
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        // Constructor with only data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to convert an array into a linked list
    static Node convertArr2LL(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);   // Create head with the first element
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {  // Start from index 1
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

     static int lengthOfLL(Node head){
        int count = 0;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            count++;
        }
        return count;
    }

    // Function to print the linked list
    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static int searchLL(Node head, int val){

        Node temp = head;
        while(temp!=null){
            if(temp.data == val){
                return 1;
            }
            temp = temp.next;
        }
        System.out.println();
return 0;
    }

    public static void main(String[] args) {
        int[] arr = {111, 2, 3, 4, 5};

        Node head = convertArr2LL(arr);

        System.out.print("Linked List: ");
        printLinkedList(head);
        System.out.println();
        System.out.println("Size of LL "+lengthOfLL(head));
        System.out.println();
        System.out.println("T"+searchLL(head, 300));
    }
}
