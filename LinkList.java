//单链表
class  List<T> {
    Node first;
    int num;

    List() {
        first = null;
        num = 0;
    }

    boolean add(T data, int index) {

        Node p = first, q = p.next;
        int i = 0;
        if (index < 0 | index > num)
            System.out.println("数值错误");
        if (first == null || index == 0) {
            Node newnode = new Node(data);
            newnode.next = first;
            first = newnode;
        } else {
            for (; i < index - 1; i++) {
                p = q;
                q = q.next;
            }
            Node newnode = new Node(data, q);
            p.next = newnode;
        }
        num++;
        return true;
    }

    void add(T data) {
        Node newnode = new Node(data);
        newnode.next = first;
        first = newnode;
        num++;
    }
   /* void add(Node newnode){
        newnode.next=first;
        first=newnode;
    }*/

    void remove(int index) {
        Node p = first, q = first.next;
        if (index > num - 1 | index < 0)
            System.out.println("index doesn't exist");
        if (index == 0)
            first = first.next;
        else {
            for (int i = 0; i < index - 1; i++) {
                p = q;
                q = q.next;
            }
            p.next = q.next;
        }
        num--;
    }

    void nextOrder() {
        Node p = first;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }

    }
}
class Node<T>{
    T data;
    Node next;
    Node(T data,Node next){
        this.data=data;
        this.next=next;
    }
    Node(T data){
        this(data,null);
    }
}
