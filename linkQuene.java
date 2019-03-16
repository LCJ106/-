public class linkQuene<T>{
    private Node<T> front,rear;
    private int length;
    public linkQuene(){
        length=0;
        front=rear=null;
    }
    public void enquene(T newEntry){
        Node newNode=new Node(newEntry);
        if(isEmpty()){
            front=newNode;
        }
        else {
            rear.next = newNode;
        }
        rear=newNode;
    }
    public boolean isEmpty(){
        return(front==null)&(rear==null);
    }
    public T dequene(){
        if(isEmpty()){
            System.out.println("队列空");
            return null;
        }
        T x=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        return x;
    }
    public void clear(){
        front=null;
        rear=null;
    }

}
