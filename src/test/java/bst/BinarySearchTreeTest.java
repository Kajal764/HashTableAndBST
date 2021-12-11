package bst;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {

    @Test
    public void givenNumbers_WhenAddedToBST_ShouldReturnSize() {
        MyBinaryTree myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        System.out.println(myBinaryTree.root);
        Assert.assertEquals(3,myBinaryTree.getSize());
    }
}


