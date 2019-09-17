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
        nodeTail = new Node("tail", node);
        nodeHead = new Node("head", node);
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
        myLinkedList.addNodeInLast(nodeHead);
        myLinkedList.addNodeInLast(node);
        myLinkedList.addNodeInLast(nodeTail);
        assertEquals(myLinkedList.traverse(), 3);
    }

}









