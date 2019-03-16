//顺序表
public class sequenceList<T> {
    final int MaxSize=10;
    private T[] listarray;
    private int length;
    public sequenceList(){
        length=0;
        listarray=(T[])new Object[MaxSize];
    }
    public sequenceList(int x){
        if(x<=0){
            System.out.println("error");
            System.exit(1);
        }
        length=0;
        listarray=(T[])new Object[x];
    }
    public boolean push(T data,int pos){
        if(pos<=0|pos>length+1){
            System.out.println("error");
            return false;
        }
        if(length==listarray.length){
            T[] p=(T[])new Object[2*length];
            for(int i=0;i<length-1;i++)
                p[i]=listarray[i];
            listarray=p;
        }
        for(int i=length;i>=pos;i--){
            listarray[i]=listarray[i-1];
        }
        listarray[pos-1]=data;
        length++;
        return true;
    }
    public T remove(int pos){
        if(isEmpty())
            return null;
        if(pos<=0|pos>length) {
            System.out.println("error");
            return null;
        }
        T x=listarray[pos-1];
        for(int i=pos-1;i<length;i++){
            listarray[i]=listarray[i+1];
        }
        length--;
        return x;
    }
    public boolean isEmpty(){
        if(length==0)
            return true;
        return false;
    }
    public int find(T obj){
        if(isEmpty())
            return -1;
        for(int i=0;i<length;i++) {
            if (listarray[i] == obj)
                return i++;
        }
        return -1;
    }
}
