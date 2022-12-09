package others.bst;


public class Tree {
  public static void main(String[] args) {
    BinaryTree binaryTree = new BinaryTree();

    binaryTree.addNode(10);
    binaryTree.addNode(20);
    binaryTree.addNode(15);
    binaryTree.addNode(30);

    binaryTree.search();
  }
}

class BinaryTree {
  Node root;

  public void addNode(int data) {
    if (this.root == null) {
      this.root = new Node(data);

    } else {
      this.root.createChild(data);

    }
  }

  public void search() {
    System.out.println(this.root.searchNode(0));
  }
}


class Node {
  int data = -1;
  Node left, right;
  
  Node(int data) {
    this.data = data;
  }

  public void createChild(int childData) {
    if (childData > data) {
      
      if (this.right == null) {
        System.out.println("criei right: "+childData);
        this.right = new Node(childData);
      } else {
        System.out.println("Proximo nó");
        this.right.createChild(childData);
      }
    } else {
      if (this.left == null) {
        System.out.println("criei left: "+childData);
        this.left = new Node(childData);
      } else {
        this.left.createChild(childData);
      }
    }
  }

  public int searchNode(int height) {
    if (data == -1) {
      System.out.println("Arvore vázia.");
    } else {
      height++;
    }

    if (this.right == null) {
      this.left.searchNode(height);
    } else {
      this.right.searchNode(height);
    }

    if (this.left == null) {
      this.right.searchNode(height);
    } else {
      this.left.searchNode(height);
    }

    return height;
  }
}