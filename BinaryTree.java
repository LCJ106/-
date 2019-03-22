class BinaryNode<T>{
    private T data;
    private BinaryNode<T> leftchild;
    private BinaryNode<T> rightchild;
    public BinaryNode(){
        this(null);
    }
    public BinaryNode(T dataPortion){
        this(dataPortion,null,null);
    }
    public BinaryNode(T dataPortion,BinaryNode<T> newleftchild,BinaryNode<T> newrightchild){
        data=dataPortion;
        leftchild=newleftchild;
        rightchild=newrightchild;
    }
    public T getData(){
        return data;
    }
    public BinaryNode<T> getLeftChild(){
        return leftchild;
    }
    public BinaryNode<T> getRighrChild(){
        return rightchild;
    }
    public void setLeftChild(BinaryNode<T> newLeftChild){
        leftchild=newLeftChild;
    }
    public void setRightChild(BinaryNode<T> newRightChild){
        rightchild=newRightChild;
    }
    public int getHeight(){
        return getHeight(this);
    }
    private int getHeight(BinaryNode<T> node){
        int height=0;
        if(node!=null){
            height=1+Math.max(getHeight(node.leftchild),getHeight(node.rightchild));
        }
        return height;
    }
    public int getNumbersOfNodes(){
        int leftnumber=0;
        int rightnumber=0;
        if(leftchild!=null)
            leftnumber=leftchild.getNumbersOfNodes();
        if(rightchild!=null)
            rightnumber=rightchild.getNumbersOfNodes();
        return 1+leftnumber+rightnumber;
    }

}
public class BinaryTree<T> {
    public BinaryNode<T> root;//root节点
    public BinaryTree(){
        root=null;
    }
    public BinaryTree(T data){
        root=new BinaryNode<>(data);
    }
    public BinaryTree(T rootdata,BinaryTree<T> leftTree,BinaryTree<T> rightTree){
        privateSetTree(rootdata,leftTree,rightTree);

    }
    private void privateSetTree(T rootdata,BinaryTree<T> leftTree,BinaryTree<T> rightTree){
        root=new BinaryNode<>(rootdata);
        if(leftTree!=null)
            root.setLeftChild(leftTree.root);
        if(rightTree!=null){
            root.setRightChild(rightTree.root);
        }

    }
    public void inorderTraverse(){  //中序遍历
        inorderTraverse(root);
    }
    public void inorderTraverse(BinaryNode<T> node){
        if(node!=null){
            inorderTraverse(node.getLeftChild());
            System.out.println(node.getData());
            inorderTraverse(node.getRighrChild());
        }
    }
