public class MyQueue<E> {
    private class Node {
        private E data = null;
        private Node next = null;

        public Node() {
        }

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head = null;
    private Node tail = null;

    public MyQueue() {
    }

    public void enqueue(E e) {
        Node node = new Node(e, null);
        if (this.head == null) {
            this.head = this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
    }

    public E dequeue(){
        if(head==null) return null;
        Node node=head;
        head=head.next;
        return node.getData();
    }

    @Override
    public String toString() {
        String result="[";
        Node node=this.head;
        while(node!=null){
            result+=node.getData();
            if(node.next!=null) result+=", ";
            node=node.getNext();
        }
        return result+"]";
    }
}