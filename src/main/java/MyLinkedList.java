public class MyLinkedList {
    Node head;
    Node tail;
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
        return traverse;
    }
    public int traverse() {
        int listSize = 0;
        if (head == null) {
            return listSize;
        } else {
            Node temṕHead = head;
            while(tempHead != null) {
                System.out.print("Node : " + tempHead.toString());
                System.out.println(", ");
                tempHead = tempHead.getNext();
                listSize++;
            }
            System.out.println("");
        }
        return listSize;
    }
}
