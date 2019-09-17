import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest{

    private Node nodeHead;
    private Node nodeTail;
    private Node node;
    private MyLinkedList myLinkedList;

    @Before
    public void setup(){
        node = new Node();
        nodeTail = new Node();
        nodeHead = new Node();
        myLinkedList = new MyLinkedList();
    }

    @Test
    public void testListSizeWithHeadNull(){
        nodeHead = null;
        assertEquals(myLinkedList.traverse() , 0);
    }

    @Test
    public void testListSizeWithHeadNotNull(){
        myLinkedList.addNodeInLast(nodeHead);
        assertEquals(myLinkedList.traverse() , 1);
    }

    @Test
    public void testAddNodeInTheEnd(){
        nodeHead.setData("head");
        nodeHead.setNext(node);
        node.setData("Middle one");
        node.setNext(nodeTail);
        nodeTail.setData("tail");

        myLinkedList.addNodeInLast(nodeHead);
        myLinkedList.addNodeInLast(node);
        myLinkedList.addNodeInLast(nodeTail);

        assertEquals(myLinkedList.traverse(), 3);
    }

}









