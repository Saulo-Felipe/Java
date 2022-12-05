package others.binaryTree;



public class Tree {
  public static void main(String[] args) {
    BinaryTree binaryTree = new BinaryTree(10);

    binaryTree.root.left = new Node(12);
    binaryTree.root.right = new Node(20);

    System.out.println(binaryTree.root.data);
    System.out.println(binaryTree.root.left.data);
    System.out.println(binaryTree.root.right.data);
  }
}

class Node {
  int data = -1;
  Node left, right;
  
  Node(int data) {
    this.data = data;
  }
}

class BinaryTree {
  Node root;

  BinaryTree(int data) {
    this.root = new Node(data);
  }

  public int getData() {
    return root.data;
  }
  
}