package bst;

public class MyBinaryNode<K extends Comparable> {
    public MyBinaryNode<K> leftNode;
    public MyBinaryNode<K> rightNode;
    K key;

    public MyBinaryNode(K key) {
        this.key = key;
        this.leftNode = null;
        this.rightNode = null;
    }

    @Override
    public String toString() {
        return "MyBinaryNode{" +
                "leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                ", key=" + key +
                '}';
    }
}
