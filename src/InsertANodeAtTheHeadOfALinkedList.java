import java.io.BufferedWriter;
import java.io.IOException;

public class InsertANodeAtTheHeadOfALinkedList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }


    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            try {
                bufferedWriter.write(String.valueOf(node.data));
            } catch (IOException e) {
                e.printStackTrace();
            }

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode temp;
        if(llist == null){
            llist = new SinglyLinkedListNode(data);
            return llist;
        }
        temp = new SinglyLinkedListNode(data);
        temp.next = llist;
        llist = temp;
        return llist;


    }

    public static void main(String[] args) {

    }
}
