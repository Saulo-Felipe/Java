package others.training;


public class ListaEncadeada {
  public static void main(String[] args) {
    LinkedList firstNode = new LinkedList();

    firstNode.add(30);
    firstNode.add(20);
    firstNode.add(60);
    firstNode.add(90);
    firstNode.remove(30);
    firstNode.remove(20);
    firstNode.remove(60);
    // firstNode.remove(20);
    firstNode.remove(0);

    System.out.println("Posição do 90: "+firstNode.search(90));    
    System.out.println(firstNode.length());
  }

}

class LinkedList { // Considerando que será uma lista encadeada de inteiros

  LinkedList next; // default null
  int data = -1;

  public void add(int element) {
    if (this.data == -1) {
      this.next = new LinkedList();
      this.data = element;
      System.out.println("Elemento ["+element+"] adicionado.");

    } else {
      this.next.add(element);
    }
  }

  public void remove(int element) {
    if (this.data == element) {
      this.data = this.next.data;
      this.next = this.next.next;
      System.out.println("Elemento ["+element+"] removido.");

    } else if (this.data == -1) {
      System.out.println("Esse elemento não existe");

    } else {
      this.next.remove(element);

    }
  }

  public int search(int element) {
    return search2(element, 0);
  }

  private int search2(int element, int pos) {
    
    if (this.data == element) {
      return pos;
    } else if (data == -1) {
      return -1;
    }

    return this.next.search2(element, pos+1);
  }

  public int length() {    
    return length2(0);
  }

  private int length2(int pos) {
    if (data == -1) {
      return pos;
    }

    return this.next.length2(pos+1);
  }
}