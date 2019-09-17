public class MyLinkedList {
    private Node head;
    private Node tail;

    public void addNodeInLast(Node node) {
        if (null == head) {
            head=node;
            tail=node;
        } else {
            tail.setNext(node);
            tail=node;
        }
    }

    public int getSize(){
        return traverse();
    }

    public int traverse() {
        int listSize = 0;
        if (head == null) {
            return listSize;
        } else {
            Node tempHead = head;
            while(tempHead != null) {
                System.out.print("Node : " + tempHead.toString());
                System.out.println(", ");
                listSize++;
                tempHead = tempHead.getNext();
            }
            System.out.println("");
        }
        return listSize;
    }
}
