public class LinkedList implements Collection{

    Node firstNode=null;

    int size=0;
    public void add(Object o) {
        Node lastNode=firstNode.nextNode;
        while (lastNode.data != null) {
            lastNode=lastNode.nextNode;
        }
        lastNode.data=o;
        lastNode.nextNode=new Node();
        size++;
    }

    public int size() {
        return size;
    }


    private class Node {
        Object data;
        Node nextNode;

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }
}
